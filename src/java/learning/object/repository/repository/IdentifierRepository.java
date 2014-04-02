package learning.object.repository.repository;

import java.util.ArrayList;
import java.util.List;
import learning.object.repository.domain.Identifier;
import learning.object.repository.interfaces.CRUD;
import learning.object.repository.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
public class IdentifierRepository implements CRUD<Identifier> {
    private Session session;
    
    public IdentifierRepository() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    @Override
    public void save(Identifier object) {
        try {
            session.beginTransaction().begin();
            session.save(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public void delete(Identifier object) {
        try {
            session.beginTransaction().begin();
            session.delete(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public void update(Identifier object) {
        try {
            session.beginTransaction().begin();
            session.update(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public Identifier find(int id) {
        Identifier identifier = new Identifier();
        try {
            //session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction().begin();
            Criteria query = session.createCriteria(Identifier.class);
            query.add(Restrictions.eq("id", id));
            identifier = (Identifier) query.uniqueResult();
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        return identifier;
    }

    @Override
    public List<Identifier> all() {
        List<Identifier> list = new ArrayList<Identifier>();
        try {
            session.beginTransaction().begin();
            Criteria criteria = session.createCriteria(Identifier.class);
            list = criteria.list();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        return list;
    }
    
}
