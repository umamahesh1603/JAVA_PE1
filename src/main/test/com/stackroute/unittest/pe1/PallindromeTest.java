package com.stackroute.unittest.pe1;

import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeTest {

    @Test
    public void checkPallindrome() {
        Pallindrome pallindromeobject = new Pallindrome();
        String result = pallindromeobject.checkPallindrome(234);
        assertEquals("not pallindrome",result);
    }
}