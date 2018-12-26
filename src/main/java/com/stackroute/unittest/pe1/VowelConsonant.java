package com.stackroute.unittest.pe1;
import java.util.Scanner;
import java.util.*;
import java.io.* ;
import java.util.Scanner;
public class VowelConsonant {
    public static void CheckVowConso(String s) {
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                    System.out.println(" - Vowel ");

                case 'e':
                    System.out.println(" - Vowel ");

                case 'i':
                    System.out.println(" - Vowel ");

                case 'o':
                    System.out.println(" - Vowel ");

                case 'u':
                    System.out.println(" - Vowel ");

                default:
                    System.out.println(" - Consonant ");

            }

        }
    }
    public static void main(String args[]) {
        Scanner Input = new Scanner(System.in);
        String s = new String();
         s = Input.nextLine();
         CheckVowConso(s);

        }


    }

