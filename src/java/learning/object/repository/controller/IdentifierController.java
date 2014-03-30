/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning.object.repository.controller;

import java.util.List;
import learning.object.repository.domain.Identifier;
import learning.object.repository.interfaces.CRUD;
import learning.object.repository.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
public class IdentifierController implements CRUD<Identifier> {
    private Session session;
    
    @Override
    public void save(Identifier object) {
        if (object == null) 
            throw new NullPointerException("Objeto " + Identifier.class.getSimpleName() + " não pode ser nulo");
        
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction().begin();
            session.save(object);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            System.err.println(ex);
        } finally {
            session.close();
        }
    }

    @Override
    public void delete(Identifier object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Identifier object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Identifier find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Identifier> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
