/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning.object.repository.controller;

import java.util.List;
import learning.object.repository.domain.General;
import learning.object.repository.interfaces.CRUD;
import learning.object.repository.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
public class GeneralController implements CRUD<General> {
    private Session session;
    
    @Override
    public void save(General object) {
        if (object == null)
            throw new NullPointerException("Objeto " + General.class.getSimpleName() + " não pode ser nulo");
        
        if ((object.getTitle() == null) || (object.getLanguage().equals("")))
            throw new NullPointerException("O preenchimento do título é obrigatório.");
        
        if ((object.getLanguage() == null) || (object.getLanguage().equals("")))
            throw new NullPointerException("O preenchimento da linguagem é obrigatório.");
        
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
    public void delete(General object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(General object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public General find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<General> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
