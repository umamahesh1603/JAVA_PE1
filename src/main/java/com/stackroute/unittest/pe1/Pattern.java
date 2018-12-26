package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Pattern {
    public int printPattern(int number){
        for(int i=1;i<=number;i++){
            for(int j=1;j<=i;j++){
                return (i);
            }

        }
    }
    public static void main(String args[]){
        Scanner Input = new Scanner(System.in);
        int number = Input.nextInt();
		printPattern();
    }
}
