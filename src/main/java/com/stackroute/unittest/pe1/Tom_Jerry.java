package com.stackroute.unittest.pe1;/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Tom_Jerry {
    public  String PrintTomorJerry(int p){
        int	k = p%2;
        if(k!=0 && p>20 && p<30){
            return ("Tom");
        }else if(k==0 && p>20 && p<30){

            return ("Jerry");
        }
    }
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();


    }

}