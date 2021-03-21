package com.xt.study.algo.sort;

import java.util.Arrays;

public class MergeSort {
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
        mergeSort(arr, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int begin, int end) {
        if (null == arr || begin >= end) {
            return;
        }
        int middle = (begin + end) >> 1;
        mergeSort(arr, begin, middle);
        mergeSort(arr, middle + 1, end);
        merge(arr, begin, middle, end);
    }

    private static void merge(int[] arr, int begin, int middle, int end) {
        int[] tempArr = new int[end - begin + 1];
        int index = 0, i = begin, j = middle + 1;
        while (i <= middle && j <= end) {
            if (arr[i] <= arr[j]) {
                tempArr[index++] = arr[i++];
            } else {
                tempArr[index++] = arr[j++];
            }
        }
        while (i <= middle) {
            tempArr[index++] = arr[i++];
        }

        while (j <=end) {
            tempArr[index++] = arr[j++];
        }

        for (int m = 0; m < index; ++m) {
            arr[begin + m] = tempArr[m];
        }
    }

}
