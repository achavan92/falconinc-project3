/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.falconinc.project3;

import javax.swing.JFrame;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author epigott
 */
public class SearchEngineAdminWindowTest {
    
    public SearchEngineAdminWindowTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class SearchEngineAdminWindow.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        SearchEngineAdminWindow.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of panel method, of class SearchEngineAdminWindow.
     */
    @Test
    public void testPanel() {
        System.out.println("panel");
        SearchEngineAdminWindow instance = new SearchEngineAdminWindow();
        JFrame expResult = null;
        JFrame result = instance.panel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
