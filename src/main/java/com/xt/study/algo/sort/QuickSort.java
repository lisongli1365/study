package com.xt.study.algo.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {};
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {3, 1, 5, 2, 6, 7, 4};
        int[] arr3 = {7, 6, 5, 4, 3, 2, 1};

        sort(arr);
        System.out.println(Arrays.toString(arr));

        sort(arr1);
        System.out.println(Arrays.toString(arr1));

        sort(arr2);
        System.out.println(Arrays.toString(arr2));

        sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }

    public static void sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] arr, int begin, int end) {
        if (null == arr || begin >= end) {
            return;
        }
        int temp = arr[begin];
        int i = begin, j = end;
        while (i < j) {
            while (j > i && arr[j] >= temp) --j;
            arr[i] = arr[j];

            while (i < j && arr[i] < temp) ++i;
            arr[j] = arr[i];
        }
        arr[i] = temp;

        quickSort(arr, begin, i - 1);
        quickSort(arr, i + 1, end);
        //I will test git commit a
    }
}
