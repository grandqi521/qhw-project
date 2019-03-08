package com.xiaomi.leetcode.solution.Array;

/**
 * Auther: Qi Hongwei
 * Date: 3/8/19 11:35
 * Description:
 */
public class BinarySearch {
    public int biSearch(int[] arr, int key){
        if(arr == null || arr.length == 0)
            return -1;
        int low = 0, hight = arr.length - 1;
        while (low <= hight){
            int middle = (low+hight)/2;
            if (arr[middle] < key){
                low = middle + 1;
            } else if (arr[middle] > key){
                hight = middle - 1;
            } else {
                return middle;
            }

        }
        return -1;
    }
}
