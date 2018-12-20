package com.stackroute.unittest.pe1;

import java.util.Scanner;

public class Repetition {
    public String PrintRepeatPattern(String s , int num){
        int length = s.length();
        String repeatstr = (s.substring(length-num,length));
        for(int i=0;i<num;i++){
            s = s+repeatstr;
        }
        return (s);

    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        int num = input.nextInt();
        PrintRepeatPattern(s,num);

    }
}
