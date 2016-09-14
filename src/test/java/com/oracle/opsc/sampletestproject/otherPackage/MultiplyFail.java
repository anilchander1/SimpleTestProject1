/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.opsc.sampletestproject.otherPackage;

import annotations.TestCase;
import annotations.TestMetaData;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anilcha
 */
@TestMetaData(summary="Testcase to validate multiplication functionality", testType="Automated", designer="sreeja.sekhar@oracle.com", component="Test Component", testStatus="Design", automationStatus="Planned", testPriority="1-Critical", maintenanceRelease="N", numberOfTestCases="3", browserTest="No")
public class MultiplyFail {
    
    public MultiplyFail() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
        
     @TestCase("This step will verify the multiplication of mixed sign integers|Add two integers: -2+ 3 = ?|expected: +1")
     @Test
     public void bmultiply() {}
     
     @TestCase("This step will verify the multiplication of two integers|Add two integers: 2+3 = ?|expected: 5")
     @Test
     public void multiply() {}
     
     @TestCase("This step will verify the multiplication of two -ve integers|Add two integers: -2+ -3 = ?|expected: -5")
     @Test
     public void amultiply() {}
}
