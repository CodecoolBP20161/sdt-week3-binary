package com.codecool.ipbinary.model;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * @author kovacsa
 */
public class BinaryIPTest extends TestCase {

    @Test
    public void testGetBinaryValue() throws Exception {

        assertEquals("10101100.00010000.11111110.00000001", new BinaryIP("172.16.254.1").getBinaryValue());

    }

}