package SortAlgorites;

public class BubbleSort {

    public BubbleSort() {




    }

    public int[] BubbleSortMethod(int[] Array) {

        for (int i = 1; i < Array.length - 1; i++) {
            for (int j = 1; j < Array.length - i; j++) {
                if (Array[j] > Array[j + 1]) {
                    int temp = Array[j + 1];
                    Array[j + 1] = Array[j];
                    Array[j] = temp;
                }

            }
        }
        return Array;
    }



}
