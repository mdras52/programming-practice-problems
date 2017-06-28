package com.mdras52.jpe.pe3;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by matthewrasler on 4/10/16.
 * To test the OddEven class
 */
public class OddEvenTest {

    @Test
    public void testEven() {
        assertTrue(OddEven.isEven(2));
    }

    @Test
    public void testOdd() {
        assertTrue(OddEven.isOdd(3));
    }

    @Test
    public void testOne() {
        assertTrue(OddEven.isOdd(1));
    }

    @Test
    public void testZero() {
        assertTrue(OddEven.isEven(0));
    }

    @Test
    public void testNegEven() {
        assertTrue(OddEven.isEven(-2));
    }

    @Test
    public void testNegOdd() {
        assertTrue(OddEven.isOdd(-3));
    }

    @Test
    public void testNegOdd2() {
        assertTrue(OddEven.isOdd(-30000001));
    }

    @Test
    public void testMaxOdd() {
        assertTrue(OddEven.isOdd(Integer.MAX_VALUE));
    }
}
