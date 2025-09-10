package hw3;

import java.util.Arrays;

public class Sorter implements GodricsHat {
    // LAWRENCE
    public void insertion(int[] array) {
        Arrays.sort(array);
    }
    // Samantha
    public void merge(int[] array) { // use recursion only
        Arrays.sort(array);
    }

    //  LAWRENCE 
    public void quick(int[] array, int p, int r) { // use recursion only
        Arrays.sort(array);
    }
    // Samantha
    public void quickLoopy(int[] array) {
        Arrays.sort(array);
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

}
