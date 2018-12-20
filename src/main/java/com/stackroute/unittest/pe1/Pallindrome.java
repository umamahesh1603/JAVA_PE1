package com.stackroute.unittest.pe1;

import java.util.Scanner;
import java.io.*;



public class Pallindrome {
    public static String checkPallindrome(int n) {
        int[] array = new int[100];
        int index=0;
        int temp;
        int flag = 0;

        while((n/10)!=0){

            temp = n%10;
            array[index] = temp;
            index=index+1;
            n = n/10;

        }
        array[index]=n;
        int c=0;
        int length = array.length;
        while(c<index) {
            if (array[c]!=array[index]) {
                flag = 1;
                break;
            } else{
                index = index-1;
                c = c+1;
            }

        }
        int sum = 0;
        if(flag==0) {
            return "Pallindrome";
            for(int j=0;j<length;j++){
                if(array[j]%2==0){
                    sum = sum+array[j];
                }
            }
            if(sum>25){
                return "the sum is greater";
            }else
            if(sum<25){
                return "less than 25";
            }else
                return "equal to 25";
        }else
            return "not pallindrome";

    }

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int number = Input.nextInt();
        String result = CheckPallindrome(number);
        return result;


    }

}