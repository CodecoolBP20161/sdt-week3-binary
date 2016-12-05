package com.codecool.ipbinary.model;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * @author kovacsa
 */
public class BinaryIntegerTest {

    @Test
    public void testGetStringValue() {

        assertEquals("11111110", new BinaryInteger(254).getStringValue());
        assertEquals("00000001", new BinaryInteger(1).getStringValue());

    }

    @Test(expected = RuntimeException.class)
    public void testBigNumber(){
        new BinaryInteger(1000);
    }


}