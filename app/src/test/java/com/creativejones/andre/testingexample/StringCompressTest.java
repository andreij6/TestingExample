package com.creativejones.andre.testingexample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCompressTest {


    @Test
    public void testCompress() throws Exception {
        String actual = StringCompress.compress("aabcccccaaa");

        String expected = "a2b1c5a3";

        assertEquals("Not Equal", expected, actual);
    }

    @Test
    public void testCompressSame() throws Exception {
        String actual = StringCompress.compress("abc");

        String expected = "abc";

        assertEquals("Not Equal", expected, actual);
    }
}