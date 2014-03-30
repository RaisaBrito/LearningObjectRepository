/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.object.repository.controller;

import java.util.List;
import learning.object.repository.domain.Technical;
import learning.object.repository.interfaces.CRUD;
import learning.object.repository.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
public class TechnicalController implements CRUD<Technical> {

    private Session session;

    @Override
    public void save(Technical object) {
        if (object == null)
            throw new NullPointerException("O objeto " + Technical.class.getSimpleName() + " não pode ser nulo.");

        if (object.getPlatformType() == null)
            throw new NullPointerException();

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction().begin();
            session.save(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Technical object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Technical object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Technical find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Technical> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}