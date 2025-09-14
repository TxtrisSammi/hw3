package hw3;

import java.util.Arrays;

public class Sorter implements GodricsHat {
    // LAWRENCE
    public void insertion(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }

    // Samantha
    public void merge(int[] array) { // use recursion only
        Arrays.sort(array);
    }

    //  LAWRENCE 
    public void quick(int[] array, int p, int r) { // use recursion only
        if (p < r) {
            int pivot = array[r];
            int i = p - 1;
            for (int j = p; j < r; j++) {
                if (array[j] <= pivot) {
                    i++;
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[i + 1];
            array[i + 1] = array[r];
            array[r] = temp;
            int q = i + 1;

            quick(array, p, q - 1);
            quick(array, q + 1, r);
        }
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

    // ---- Quick test for Lawrence's methods ----
    public static void main(String[] args) {
        Sorter sorter = new Sorter();

        int[] arr1 = {5, 2, 9, 1, 3};
        sorter.insertion(arr1);
        System.out.println("Insertion sorted: " + Arrays.toString(arr1));

        int[] arr2 = {10, 7, 8, 9, 1, 5};
        sorter.quick(arr2, 0, arr2.length - 1);
        System.out.println("Quick sorted: " + Arrays.toString(arr2));
    }
}



