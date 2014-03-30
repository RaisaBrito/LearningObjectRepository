/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learning.object.repository.controller;

import java.util.List;
import learning.object.repository.domain.Technical;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rogério Pimentel <rgercp@mail.com>
 */
public class TechnicalControllerTest {

    public TechnicalControllerTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of save method, of class TechnicalController.
     */
    @Test
    public void testSave() {
        Technical object = new Technical();
        object.setEssential((short) 1);
        object.setPlatformType("Movel");
        TechnicalController instance = new TechnicalController();
        instance.save(object);
        System.out.println("save");
    }

    /**
     * Test of delete method, of class TechnicalController.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Technical object = null;
        TechnicalController instance = new TechnicalController();
        instance.delete(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class TechnicalController.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Technical object = null;
        TechnicalController instance = new TechnicalController();
        instance.update(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class TechnicalController.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        int id = 0;
        TechnicalController instance = new TechnicalController();
        Technical expResult = null;
        Technical result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of all method, of class TechnicalController.
     */
    @Test
    public void testAll() {
        System.out.println("all");
        TechnicalController instance = new TechnicalController();
        List<Technical> expResult = null;
        List<Technical> result = instance.all();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
