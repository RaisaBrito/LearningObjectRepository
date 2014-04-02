package learning.object.repository.repository;

import java.util.ArrayList;
import java.util.List;
import learning.object.repository.domain.General;
import learning.object.repository.interfaces.CRUD;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
public class GeneralRepository implements CRUD<General> {
    private Session session;
    
    @Override
    public void save(General object) {
        try {
            session.beginTransaction().begin();
            session.save(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public void delete(General object) {
        try {
            session.beginTransaction().begin();
            session.delete(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public void update(General object) {
        try {
            session.beginTransaction().begin();
            session.update(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public General find(int id) {
        General general = new General();
        try {
            //session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction().begin();
            Criteria query = session.createCriteria(General.class);
            query.add(Restrictions.eq("id", id));
            general = (General) query.uniqueResult();
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        return general;
    }

    @Override
    public List<General> all() {
        List<General> list = new ArrayList<General>();
        try {
            session.beginTransaction().begin();
            Criteria criteria = session.createCriteria(General.class);
            list = criteria.list();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        return list;
    }
}
