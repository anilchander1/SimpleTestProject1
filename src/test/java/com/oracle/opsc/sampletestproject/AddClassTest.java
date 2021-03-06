/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oracle.opsc.sampletestproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import annotations.*;

/**
 *
 * @author anilcha
 */
@TestMetaData()
public class AddClassTest {

    public AddClassTest() {
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
    @api("Addition")
    @TestCase("This test is for validating Addition of two numbers|Add 3 to 2|Result should be 5")
    @Test
    public void hello() {
        AddClass ac = new AddClass();
        int actual = ac.add(2, 3);
        assertEquals(6, actual);
    }
    
    @api("NULL Test")
    @TestCase("This test is for validating blank logic|Trying to skip any logic|Result should be nothing")
    @Test
    public void hello1() {
        AddClass ac = new AddClass();
        int actual = ac.add(2, 3);
        assertEquals(6, actual);
    }
}
