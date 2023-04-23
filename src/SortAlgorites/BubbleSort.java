package SortAlgorites;

public class BubbleSort {

    public BubbleSort() {

    }

    public int[] BubbleSortMethod(int[] Array) {

        for (int i = 0; i < Array.length; i++) {
            int max = Array[i];
            for (int j = 1 + i; j < Array.length; j++) {

                if (max > Array[j]) {
                    max = Array[j];
                    int temp = Array[i];
                    Array[i] = Array[j];
                    Array[j] = temp;


                }
            }

        }


        return Array;
    }


}
