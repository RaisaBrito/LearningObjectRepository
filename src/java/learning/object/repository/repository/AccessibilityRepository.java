package learning.object.repository.repository;

import java.util.ArrayList;
import java.util.List;
import learning.object.repository.domain.Accessibility;
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
public class AccessibilityRepository implements CRUD<Accessibility> {

    private Session session;

    public AccessibilityRepository() {
        session = HibernateUtil.getSessionFactory().openSession();
    }
    
    @Override
    public void save(Accessibility object) {
        try {
            session.beginTransaction().begin();
            session.save(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public void delete(Accessibility object) {
        try {
            session.beginTransaction().begin();
            session.delete(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public void update(Accessibility object) {
        try {
            session.beginTransaction().begin();
            session.update(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

   @Override
    public Accessibility find(int id) {
        Accessibility accessibility = new Accessibility();
        try {
            session.beginTransaction().begin();
            Criteria query = session.createCriteria(Accessibility.class);
            query.add(Restrictions.eq("id", id));
            accessibility = (Accessibility) query.uniqueResult();
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        return accessibility;
    }

    @Override
    public List<Accessibility> all() {
        List<Accessibility> list = new ArrayList<Accessibility>();
        try {
            session.beginTransaction().begin();
            Criteria criteria = session.createCriteria(Accessibility.class);
            list = criteria.list();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        return list;
    }

}
