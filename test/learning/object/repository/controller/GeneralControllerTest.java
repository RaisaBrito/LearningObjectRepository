package learning.object.repository.controller;

import learning.object.repository.repository.GeneralRepository;
import java.util.List;
import learning.object.repository.domain.General;
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
public class GeneralControllerTest {
    
    public GeneralControllerTest() {
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
     * Test of save method, of class GeneralRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        General object = new General();
        object.setTitle("Titulo obrigatorio");
        object.setLanguage("PT-BR");
        GeneralRepository instance = new GeneralRepository();
        instance.save(object);
    }

    /**
     * Test of delete method, of class GeneralRepository.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        General object = null;
        GeneralRepository instance = new GeneralRepository();
        instance.delete(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class GeneralRepository.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        General object = null;
        GeneralRepository instance = new GeneralRepository();
        instance.update(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class GeneralRepository.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        int id = 0;
        GeneralRepository instance = new GeneralRepository();
        General expResult = null;
        General result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of all method, of class GeneralRepository.
     */
    @Test
    public void testAll() {
        System.out.println("all");
        GeneralRepository instance = new GeneralRepository();
        List<General> expResult = null;
        List<General> result = instance.all();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
