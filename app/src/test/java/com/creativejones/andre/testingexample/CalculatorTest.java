package com.creativejones.andre.testingexample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator mSUT;

    @Before
    public void setUp() throws Exception {
        mSUT = new Calculator();
    }

    @Test
    public void testSum() throws Exception {
        assertEquals(6d, mSUT.sum(2d, 4d), 0);
    }

    @Test
    public void testSubtract() throws Exception {
        assertEquals(1d, mSUT.subtract(5d, 4d), 0);
    }

    @Test
    public void testDivide() throws Exception {
        assertEquals(5d, mSUT.divide(20d, 4d), 0);

    }

    @Test
    public void testMultiply() throws Exception {
        assertEquals(20d, mSUT.multiply(5d, 4d), 0);
    }
}