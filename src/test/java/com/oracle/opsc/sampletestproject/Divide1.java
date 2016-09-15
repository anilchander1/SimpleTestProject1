/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.opsc.sampletestproject;

import com.oracle.opsc.sampletestproject.*;
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
@TestMetaData(summary="Division Test Class", testType="Automated", designer="anil.x.chandran@oracle.com", component="Test Component", testStatus="Design", automationStatus="Planned", testPriority="1-Critical", maintenanceRelease="Y", numberOfTestCases="1", browserTest="No")
public class Divide1 {
    
    public Divide1() {
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
    @TestCase("This will test division of two numbers|5 should be divided by 2|result should be 2.5")
    @Test
    public void hello() {
    }
    
    @TestCase("This will test division by zero|5 should be divided by 0|Exception should be thrown")
    @Test
    public void checkVal(){
        
    }
    
    
}
