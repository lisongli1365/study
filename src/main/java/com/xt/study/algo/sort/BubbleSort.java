package com.xt.study.algo.sort;

import java.util.Arrays;

public class BubbleSort {

  public static void main(String[] args) {
    int[] arr1 = {5,3,5,1,7,9,2,6};
    int[] arr2 = {1,2,3,4,5,6,7,8,9};
    int[] arr3 = {9,8,7,6,5,4,3,2,1};
    int[] arr4 = {};
    int[] arr5 = {4,3,2,1,5,6,7,8,9};

    bubbleSort(arr1);
    System.out.println(Arrays.toString(arr1));
    bubbleSort(arr2);
    System.out.println(Arrays.toString(arr2));
    bubbleSort(arr3);
    System.out.println(Arrays.toString(arr3));
    bubbleSort(arr4);
    System.out.println(Arrays.toString(arr4));

    System.out.println("======优化一======");

    bubbleSort2(arr1);
    System.out.println(Arrays.toString(arr1));
    bubbleSort2(arr2);
    System.out.println(Arrays.toString(arr2));
    bubbleSort2(arr3);
    System.out.println(Arrays.toString(arr3));
    bubbleSort2(arr4);
    System.out.println(Arrays.toString(arr4));

    System.out.println("======优化二======");

    bubbleSort3(arr1);
    System.out.println(Arrays.toString(arr1));
    bubbleSort3(arr2);
    System.out.println(Arrays.toString(arr2));
    bubbleSort3(arr3);
    System.out.println(Arrays.toString(arr3));
    bubbleSort3(arr4);
    System.out.println(Arrays.toString(arr4));
    bubbleSort3(arr5);
    System.out.println(Arrays.toString(arr5));
  }

  /**
   * 冒泡排序
   *
   * @param arr
   */
  public static void bubbleSort(int[] arr) {
    if (null == arr || arr.length <= 1) {
      return;
    }
    for (int i = 0; i < arr.length; ++i) {
      for (int j = 0; j < arr.length - 1 - i; ++j) {
        if (arr[j+1] < arr[j]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

  /**
   * 冒泡排序优化一
   *
   * @param arr
   */
  public static void bubbleSort2(int[] arr) {
    if (null == arr || arr.length == 1) {
      return;
    }
    for (int i = 0; i < arr.length; ++i) {
      boolean swapped = false;
      for (int j = 0; j < arr.length - 1 - i; ++j) {
        if (arr[j+1] < arr[j]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
          swapped = true;
        }
      }
      //如果在一次循环中没有发生交换，表明数组已经有序
      if (!swapped) {
        break;
      }
    }
  }

  /**
   * 冒泡排序优化二
   *
   * @param arr
   */
  public static void bubbleSort3(int[] arr) {
    if (null == arr || arr.length == 1) {
      return;
    }
    int lastSwappedIndex = arr.length - 1;
    for (int i = 0; i < arr.length; ++i) {
      int k = 0;
      for (int j = 0; j < lastSwappedIndex; ++j) {
        if (arr[j+1] < arr[j]) {
          int temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;

          /**
           * 记录下一次循环中，最后一次需要交换位置的index，表明index之后已经是有序数组，无须在下次循环
           * 中再次比较，这样可以减少平均循环次数
           */
          k = j;
        }
      }
      lastSwappedIndex = k;
    }
  }

}
