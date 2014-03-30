/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.object.repository.controller;

import java.util.List;
import learning.object.repository.domain.Accessibility;
import learning.object.repository.interfaces.CRUD;
import learning.object.repository.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
public class AccessibilityController implements CRUD<Accessibility> {

    private Session session;

    @Override
    public void save(Accessibility object) {
        if (object == null)
            throw new NullPointerException("O objeto " + Accessibility.class.getSimpleName() + " não pode ser nulo.");

        // Verifica se não há objectos nulos associados
        if (((object.getGeneralId() == null) && (object.getIdentifierId() == null) && (object.getTechnicalId() == null)) || 
           ((object.getGeneralId() == null) || (object.getIdentifierId() == null) || (object.getTechnicalId() == null)))
                throw new NullPointerException("Os objetos relaciosados não podem ser nulos");

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
    public void delete(Accessibility object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Accessibility object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Accessibility find(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Accessibility> all() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
