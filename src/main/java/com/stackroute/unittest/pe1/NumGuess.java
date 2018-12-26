package com.stackroute.unittest.pe1;

import java.util.Scanner;
public class NumGuess {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        if((num>1)&&(num<50)){
            System.out.println("less than");
        }
    }
}
