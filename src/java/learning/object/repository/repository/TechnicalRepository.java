package learning.object.repository.repository;

import java.util.ArrayList;
import java.util.List;
import learning.object.repository.domain.Technical;
import learning.object.repository.interfaces.CRUD;
import learning.object.repository.interfaces.Closeable;
import learning.object.repository.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
public class TechnicalRepository implements CRUD<Technical>, Closeable {

    private Session session;
    
    public TechnicalRepository() {
        session = HibernateUtil.getSessionFactory().openSession();
    }

    @Override
    public void save(Technical object) {
        if (object == null) {
            throw new NullPointerException("O objeto " + Technical.class.getSimpleName() + " não pode ser nulo.");
        }

        if (object.getPlatformType() == null) {
            throw new NullPointerException();
        }

        try {
            //session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction().begin();
            session.save(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public void delete(Technical object) {
        if (object == null) {
            throw new NullPointerException("O objeto " + Technical.class.getSimpleName() + " não pode ser nulo.");
        }
        
        try {
            //session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction().begin();
            session.delete(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public void update(Technical object) {
        if (object == null) {
            throw new NullPointerException("O objeto " + Technical.class.getSimpleName() + " não pode ser nulo.");
        }
        
        try {
            //session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction().begin();
            session.update(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public Technical find(int id) {
        Technical technical = new Technical();
        try {
            //session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction().begin();
            Criteria query = session.createCriteria(Technical.class);
            query.add(Restrictions.eq("id", id));
            technical = (Technical) query.uniqueResult();
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        return technical;
    }

    @Override
    public List<Technical> all() {
        List<Technical> list = new ArrayList<Technical>();
        try {
            //session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction().begin();
            Criteria criteria = session.createCriteria(Technical.class);
            list = criteria.list();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        return list;
    }

    @Override
    public void close() {
        session.close();
    }

}
