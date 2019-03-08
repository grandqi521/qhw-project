package com.xiaomi.leetcode.solution.Array;

/**
 * Auther: Qi Hongwei
 * Date: 3/5/19 18:15
 * Description: https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        if (nums1.length < m + n)
            return;
        int k = (m--) + (n--) - 1;
        while(m >= 0 && n >= 0){
            nums1[k--] = nums2[n] > nums1[m] ? nums2[n--] : nums1[m--];
        }
        while(n >= 0) nums1[k--] = nums2[n--];
    }
}
