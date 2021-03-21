package com.xt.study.algo.sort;

import java.util.Arrays;

public class InsertSort {

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
        if (null == arr || arr.length <= 1) {
            return;
        }

        for (int i = 1; i < arr.length; ++i) {
            int temp = arr[i];
            int j = i - 1;
            for ( ; j >= 0 && arr[j] > temp; --j) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }
    }
}
