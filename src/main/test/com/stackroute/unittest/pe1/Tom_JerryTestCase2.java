package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Tom_JerryTestCase2 {

    @Test
    public void printTomorJerry() {
        Tom_Jerry object = new Tom_Jerry();
        String result = object.PrintTomorJerry(26);
        assertEquals("Jerry",result);
    }
}