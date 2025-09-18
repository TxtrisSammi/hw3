import java.util.Arrays;

public class Sorter implements GodricsHat {
    public void insertion(int[] array) {
        Arrays.sort(array);
    }

    public void merge(int[] array) { // use recursion only
        if (array.length < 2) {
            return;
        }
        int halfArr = array.length / 2;
        // Split arrays into smaller arrays
        int[] left = new int[halfArr];
        int[] right = new int[array.length - halfArr];
        for (int i = 0; i < halfArr; i++) {
            left[i] = array[i];
        }
        for (int i = halfArr; i < array.length; i++) {
            right[i - halfArr] = array[i];
        }

        // Recursive call to split split arrays into even more split arrays
        merge(left);
        merge(right);

        // counters for each array
        int i = 0;
        int j = 0;
        int k = 0;

        // while the left and right arrays still have remaining indexes, check which
        // contains the higher value at their index
        // grab the higher number write it to the main array at it's current index.
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
                k++;
            } else {
                array[k] = right[j];
                j++;
                k++;
            }
        }

        // When either left[] or right[] run out of indexes fill the remainder of
        // array[] with whichever array still has indexes left
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }

        // if (left[0] < right[0]) {
        // for (int i = 0; i < left.length; i++) {
        // array[i] = left[i];
        // }
        // for (int i = 0; i < right.length; i++) {
        // array[i + left.length] = right[i];
        // }
        // } else {
        // for (int i = 0; i < right.length; i++) {
        // array[i] = right[i];
        // }
        // for (int i = 0; i < left.length; i++) {
        // array[i + right.length] = left[i];
        // }
        // }

    }

    public void quick(int[] array, int p, int r) { // use recursion only
        Arrays.sort(array);
    }

    public void quickLoopy(int[] array) {
        Arrays.sort(array);

        ///////////////////NOT WORKING YET/////////////////////
        // int pivot = array[array.length / 2];

        // int i = -1;
        // pivot = loop(array, i, pivot);
    }

    public void counting(int[] array) {
        int i = 0, j = 0, k = 0, max = Integer.MIN_VALUE;
        for (i = 0; i < array.length; i++)
            max = array[i] > max ? array[i] : max;
        int[] counts = new int[max + 1];
        for (i = 0; i < array.length; i++)
            counts[array[i]]++;
        for (i = 0; i < counts.length; i++)
            for (j = 0; j < counts[i]; j++)
                array[k++] = i;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public int loop(int[] array, int i, int pivot) {
        for (int j = 0; j < pivot; j++) {
            if (array[j] < array[pivot]) {
                i++;

                swap(array, i, j);
            } else {
                swap(array, pivot, i + 1);
            }
        }
        return i + 1;
    }

}
