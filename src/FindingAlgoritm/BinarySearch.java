package FindingAlgoritm;

public class BinarySearch {

    public int BinarySearchFunction(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        int middle = (low + high) / 2;

        while (low <= high) {


            if (array[middle] == x) {
                return middle + 1;
            } else if (array[middle] > x) {
                high = middle - 1;
            } else if (array[middle] < x) {
                low = middle + 1;
            }
            middle = (low + high) / 2;
        }

        return -1;

    }

}
