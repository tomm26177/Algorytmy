package SortAlgorites;

public class SelectionSort {
    public SelectionSort() {

    }

    public int[] SelectionSortMethod(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = 1 + i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;

                }
            }
            int tem;
            tem = array[i];
            array[i] = min;
            array[index] = tem;

        }


        return array;

    }
}