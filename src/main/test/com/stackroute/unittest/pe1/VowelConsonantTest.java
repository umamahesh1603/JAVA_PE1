package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class VowelConsonantTest {

    @Test
    public void checkVowConso() {
        VowelConsonant object = new VowelConsonant();
        String result = object.CheckVowConso("a");
        assertEquals(" - Vowel ",result);
    }
}