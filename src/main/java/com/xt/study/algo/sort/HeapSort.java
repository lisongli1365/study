package com.xt.study.algo.sort;

import java.util.Arrays;

public class HeapSort {
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
        for (int i = arr.length / 2 - 1; i >= 0; --i) {
            adjustHeap(arr, i, arr.length - 1);
        }
        for (int i = arr.length - 1; i >= 0; --i) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            adjustHeap(arr, 0, i - 1);
        }
    }

    private static void adjustHeap(int[] arr, int begin, int end) {
        int temp = arr[begin];
        int parentIndex = begin;
        for (int i = parentIndex * 2 + 1; i <= end; i = 2 * parentIndex + 1) {
            if (i + 1 <= end && arr[i] < arr[i + 1]) {
                i += 1;
            }
            if (arr[i] > temp) {
               arr[parentIndex] = arr[i];
               parentIndex = i;
            } else {
                break;
            }
        }
        arr[parentIndex] = temp;
    }
}
