package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTestCase2 {

    @Test
    public void printPattern() {
        Pattern object = new Pattern();
        int result = object.PrintPattern(1);
        assertEquals(1,result);
    }
}