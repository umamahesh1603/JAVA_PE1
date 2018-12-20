package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTestCase2 {

    @Test
    public void doReverse() {
        ReverseString object = new ReverseString();
        String result = object.DoReverse("hello");
        assertEquals("olleh",result);
    }
}