package com.xiaomi.leetcode.solution.Array;

/**
 * Auther: Qi Hongwei
 * Date: 3/7/19 16:30
 * Description:
 */
public class QuickSort {
    void quick_sort(int arr[], int left, int right){
        if (left < right) {
            int i = left, j = right, target = arr[left];
            while (i < j){
                while (i < j && arr[j] > target)
                    j--;
                if (i < j)
                    arr[i++] = arr[j];
                while (i < j && arr[i] < target)
                    i++;
                if (i < j)
                    arr[j] = arr[i];

            }
            arr[i] = target;

            quick_sort(arr, left, i - 1);
            quick_sort(arr, i + 1, right);
        }
    }
}
