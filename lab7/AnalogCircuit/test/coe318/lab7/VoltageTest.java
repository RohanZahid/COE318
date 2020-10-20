/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe318.lab7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rohan Zahid
 */
public class VoltageTest {
    
    public VoltageTest() {
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
     * Test of getNode method, of class Voltage.
     */
    @Test
    public void testGetNode() {
        System.out.println("getNode");
        Node a = new Node();
        Node b = new Node();
        Voltage instance = new Voltage(5, a, b);
        Node[] expResult = {a, b};
        Node[] result = instance.getNode();
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Voltage.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Node a = new Node();
        Node b = new Node();
        Voltage instance = new Voltage(5, a, b);
        String expResult = "V" + instance.getID() + " " + a.id + " " + b.id + " DC " + instance.getVoltage();
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
