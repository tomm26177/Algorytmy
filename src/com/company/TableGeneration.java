package com.company;

import java.math.MathContext;
import java.sql.Array;

public class TableGeneration {


    TableGeneration(){

    }

     public int[] generate(int numberOfElements, int low, int high){
        int[] array = new  int[numberOfElements];
        int i=0;
         while ( i < numberOfElements ) {
             int randomize = (int) (Math.random()*high);
             if (randomize>=low){
                 array[i]=randomize;
                 i++;
             }



         }

        return array;
     };


}
