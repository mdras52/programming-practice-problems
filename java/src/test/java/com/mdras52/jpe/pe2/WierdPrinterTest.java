package com.mdras52.jpe.pe2;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by matthewrasler on 4/10/16.
 */
public class WierdPrinterTest {

    @Test
    public void testOdd() {
        assertEquals("Wierd", WierdPrinter.printWierdness(1));
    }

    @Test
    public void testEvenWierd() {
        assertEquals("Wierd", WierdPrinter.printWierdness(6));
    }

    @Test
    public void testEvenNotWierd() {
        assertEquals("Not Wierd", WierdPrinter.printWierdness(4));
    }
}
