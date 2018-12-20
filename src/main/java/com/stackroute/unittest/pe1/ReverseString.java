package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class ReverseString {
    public String DoReverse (String source){
        String reverse = "";
        for (int i = source.length() - 1; i >= 0; i--) {
            reverse = reverse + source.charAt(i);
        }
        return (reverse);


    }
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String source = s.nextLine();
        DoReverse();

    }
}