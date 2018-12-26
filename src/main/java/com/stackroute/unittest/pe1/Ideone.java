package com.stackroute.unittest.pe1;/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Ideone
{
    public int doSum(int num){
        int[] arr = new int[100];
        int temp=0;
        for(int i=0;i<num;i++){
            arr[i]=s.nextInt();
            temp = temp+arr[i];
        }
        return (temp);

    }
    public static void main (String args[]) throws java.lang.Exception
    {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int num = s.nextInt();


    }
}
