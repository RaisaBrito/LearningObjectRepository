/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package learning.object.repository.controller;

import learning.object.repository.domain.Accessibility;
import learning.object.repository.domain.General;
import learning.object.repository.domain.Identifier;
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
public class AcceccibilityControllerTest {
    
    private static final short TRUE = 1;
    private static final short FALSE = 0;
    
    public AcceccibilityControllerTest() {
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
     * Test of save method, of class AccessibilityController.
     */
    @Test
    public void testSave() {
        System.out.println("save");
        Accessibility object = new Accessibility();
        object.setAlternativesToAuditory(TRUE);
        object.setAlternativesToText(TRUE);
        object.setAnhancedCaption(TRUE);
        object.setAudioDescription(TRUE);
        object.setAvoidBlueYellow(FALSE);
        object.setAvoidGreenYellow(FALSE);
        object.setAvoidOrange(FALSE);
        object.setAvoidPurpleGrey(FALSE);
        object.setAvoidRed(FALSE);
        object.setAvoidRedBlack(FALSE);
        object.setAvoidRedGreen(FALSE);
        object.setCaptionRate(TRUE);
        object.setColorAvoidance(FALSE);
        object.setGraphicAlternative(FALSE);
        object.setHasAuditory(FALSE);
        object.setHasText(FALSE);
        object.setHasVisual(FALSE);
        object.setReducedReadingLevel(FALSE);
        object.setReducedSpeed(FALSE);
        object.setUseMaximumContrastMonochrome(TRUE);
        object.setVerbatim(TRUE);
        
        General general = new General();
        general.setTitle("Teste Title");
        general.setLanguage("US");
        GeneralController generalController = new GeneralController();
        generalController.save(general);
        
        Identifier identifier = new Identifier();
        identifier.setCatalog("CTA122");
        identifier.setEntry("C11");
        IdentifierController identifierController = new IdentifierController();
        identifierController.save(identifier);
        
        Technical technical = new Technical();
        technical.setEssential(FALSE);
        technical.setPlatformType("FIXO");
        TechnicalController technicalController = new TechnicalController();
        technicalController.save(technical);
        
        object.setGeneralId(general);
        object.setIdentifierId(identifier);
        object.setTechnicalId(technical);
        AccessibilityController instance = new AccessibilityController();        
        instance.save(object);
    }
    
}
