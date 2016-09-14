/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.opsc.sampletestproject.otherPackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import annotations.*;
import com.oracle.opsc.sampletestproject.AddClass;
/**
 *
 * @author anilcha
 */
@TestMetaData(summary="new test", testType="Automated", designer="anil.x.chandran@oracle.com", component="Test Component", testStatus="Design", automationStatus="Planned", testPriority="1-Critical", maintenanceRelease="N", numberOfTestCases="1", browserTest="No")
public class SubtractTest {
    
    public SubtractTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    @TestCase("This test is to check update|Nothing will be here|Nothing to expect")
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @api("Subtraction")
    @TestCase("This test is for validating Subtraction of two numbers|Subtract 3 from 5|Result should be 2")
    @Test
    public void hello() {
        Subtract sub=new Subtract();
        int actual=sub.subtract(5, 3);
        
        assertEquals(2, actual);
            
    }
    
    @api("NULL Test")
    @TestCase("This test is for validating blank logic|Trying to skip any logic|Result should be nothing")
    @Test
    public void hello1() {
        Subtract sub=new Subtract();
        int actual=sub.subtract(5, 3);
        
        assertEquals(2, actual);
    }
}
