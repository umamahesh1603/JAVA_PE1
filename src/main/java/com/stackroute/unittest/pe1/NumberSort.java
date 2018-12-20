package com.stackroute.unittest.pe1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class NumberSort {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int[] array = new int[100];
        int ind=0;
        int temp;

        while((number/10)!=0){

            temp = number%10;
            array[ind] = temp;
            ind=ind+1;
            number = number/10;

        }
        array[ind]=number;
        Arrays.sort(array,0,ind);
        /*String real = Arrays.toString(array);
        int result = Integer.parseInt(real);
        System.out.println(result);*/
        for(int j=0;j<=ind;j++){
            System.out.println(array[j]);
        }
    }
}
