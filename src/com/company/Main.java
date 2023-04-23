package com.company;

import FindingAlgoritm.BinarySearch;
import SortAlgorites.BubbleSort;
import SortAlgorites.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TableGeneration tableGeneration = new TableGeneration();
        int[] Array = tableGeneration.generate(10,0,100);

         BubbleSort bubbleSort =  new BubbleSort()  ;
         bubbleSort.BubbleSortMethod(Array);

        System.out.println(Arrays.toString(Array));

    }
}
