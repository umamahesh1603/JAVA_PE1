package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTestCase2 {

    @Test
    public void checkVowConso() {
        VowelConsonant object = new VowelConsonant();
        String result = object.CheckVowConso("a");
        assertEquals(" - Vowel ",result);
    }
}