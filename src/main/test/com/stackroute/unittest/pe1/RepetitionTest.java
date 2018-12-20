package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class RepetitionTest {

    @Test
    public void printRepeatPattern() {
        Repetition object = new Repetition();
        string result = object.PrintRepeatPattern("stackrou",3);
        assertEquals("stackrourourourou",result);
    }
}