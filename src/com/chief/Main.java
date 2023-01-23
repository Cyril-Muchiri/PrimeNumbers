package com.chief;

import java.time.chrono.IsoChronology;
import java.util.Scanner;

public class Main {

   public static void main(String args[]){
       int n,j,i,counter;
       n=100;



       for (i=2;i<=n;i++){
           counter=0;
           for (j=2;j<i;j++)
               if (i%j==0)
                   counter++;
           if (counter==0)
               System.out.println(i) ;

   }


}}

