package SortAlgorites;

public class InsertionSort {

    InsertionSort() {

    }

    ;

    public int[] InsertionSortMethod(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = 0; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }

            }
            if (min != 1) {
                int temp = array[min];
                array[min] = array[i];
                array[i] = temp;

            }
        }


        return array;
    }


}
