package com.creativejones.andre.testingexample;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ListUtilTest {

    ListUtil<String> mSUT;

    @Before
    public void setUp() throws Exception {
        mSUT = new ListUtil<>();
    }

    @Test
    public void testForEach() throws Exception {
        String[] data = { "first", "second", "third"};

        mSUT.setData(Arrays.asList(data));

        mSUT.forEach(new ListUtil.IForeachAction<String>() {
            @Override
            public void run(String item) {
                item.toUpperCase();
            }
        });

        assertEquals("Not uppercase", "FIRST", mSUT.firstOrDefault());
    }
}