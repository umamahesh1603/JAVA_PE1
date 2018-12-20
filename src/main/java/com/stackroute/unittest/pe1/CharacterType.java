package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class CharacterType {

    public void Chartype() {
        if (Input.charAt(0) >= 65 && Input.charAt(0) <= 91) {
            System.out.println("CapitalLetter");
        } else if (Input.charAt(0) >= 97 && Input.charAt(0) <= 122) {
            System.out.println("Small letter");
        } else if (Input.charAt(0) >= 48 && Input.charAt(0) <= 57) {
            System.out.println("Digit");
        } else
            System.out.println("Symbol");
    }


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String Input = s.next();

        Chartype();


    }
}