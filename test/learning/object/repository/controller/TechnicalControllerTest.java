package learning.object.repository.controller;

import learning.object.repository.repository.TechnicalRepository;
import java.util.List;
import learning.object.repository.domain.Accessibility;
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
     * Test of save method, of class TechnicalRepository.
     */
    @Test
    public void testSave() {
        Technical object = new Technical();
        object.setEssential((short) 1);
        object.setPlatformType("Movel");
        TechnicalRepository instance = new TechnicalRepository();
        instance.save(object);
        System.out.println("save");
    }

    /**
     * Test of delete method, of class TechnicalRepository.
     */
    @Test
    public void testDelete() {
        System.out.println("delete"); 
        TechnicalRepository instance = new TechnicalRepository();
        Technical object = instance.find(7);
        instance.delete(object);
    }

    /**
     * Test of update method, of class TechnicalRepository.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Technical object = new Technical(5);
        object.setPlatformType("3g");
        TechnicalRepository instance = new TechnicalRepository();
        instance.update(object);
    }

    /**
     * Test of find method, of class TechnicalRepository.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        int id = 2;
        TechnicalRepository instance = new TechnicalRepository();
        Technical expResult = new Technical(2);
        expResult.setEssential((short) 1);
        expResult.setPlatformType("MOVEL");

        Technical result = instance.find(id);
        assertEquals(expResult, result);

        if (result.getAccessibilityCollection() != null) {
            for (Accessibility accessibility : result.getAccessibilityCollection()) {
                System.out.println("ID: " + accessibility.getId());
            }
        }
    }

    /**
     * Test of all method, of class TechnicalRepository.
     */
    @Test
    public void testAll() {
        System.out.println("all");
        TechnicalRepository instance = new TechnicalRepository();
        int size = 12;
        List<Technical> result = instance.all();
        assertEquals(size, result.size());
    }

}
