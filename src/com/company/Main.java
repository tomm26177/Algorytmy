package com.company;

import FindingAlgoritm.BinarySearch;
import SortAlgorites.BubbleSort;
import SortAlgorites.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        TableGeneration tableGeneration = new TableGeneration();
        int[] Array = tableGeneration.generate(10,0,100);


        SelectionSort selectionSort = new SelectionSort();
        System.out.println(Arrays.toString(selectionSort.SelectionSortMethod(Array)));
        BinarySearch binarySearch= new BinarySearch();
        System.out.println(
        binarySearch.BinarySearchFunction(Array,7));

    }
}
