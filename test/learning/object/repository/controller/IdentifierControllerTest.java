package learning.object.repository.controller;

import learning.object.repository.repository.IdentifierRepository;
import java.util.List;
import learning.object.repository.domain.Identifier;
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
public class IdentifierControllerTest {

    public IdentifierControllerTest() {
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
     * Test of save method, of class IdentifierRepository.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Identifier object = new Identifier();
        object.setCatalog("CAT90");
        object.setEntry("109");
        IdentifierRepository instance = new IdentifierRepository();
        instance.save(object);
    }

    /**
     * Test of delete method, of class IdentifierRepository.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Identifier object = null;
        IdentifierRepository instance = new IdentifierRepository();
        instance.delete(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class IdentifierRepository.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Identifier object = null;
        IdentifierRepository instance = new IdentifierRepository();
        instance.update(object);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class IdentifierRepository.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        int id = 0;
        IdentifierRepository instance = new IdentifierRepository();
        Identifier expResult = null;
        Identifier result = instance.find(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of all method, of class IdentifierRepository.
     */
    @Test
    public void testAll() {
        System.out.println("all");
        IdentifierRepository instance = new IdentifierRepository();
        List<Identifier> expResult = null;
        List<Identifier> result = instance.all();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
