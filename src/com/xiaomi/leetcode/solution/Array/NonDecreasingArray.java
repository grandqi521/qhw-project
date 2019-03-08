package com.xiaomi.leetcode.solution.Array;

/**
 * Auther: Qi Hongwei
 * Date: 3/6/19 15:25
 * Description: https://leetcode.com/problems/non-decreasing-array/
 */
public class NonDecreasingArray {
    public boolean checkPossibility(int[] nums) {
        int cnt = 0;                                           //the number of changes
        // [3,4,2,3]
        for (int i = 1; i < nums.length && cnt <= 1; i++) {
            if (nums[i - 1] > nums[i]) {
                cnt++;
                // 如果nums[i - 2] <= nums[i],只需要改变nums[i - 1]的值
                // 但是如果nums[i - 2] > nums[i],则需要改变nums[i]的值
                if (i - 2 < 0 || nums[i - 2] <= nums[i])
                    nums[i - 1] = nums[i];                     //modify nums[i-1] of a priority
                else
                    nums[i] = nums[i - 1];                    //have to modify nums[i]
            }
        }
        return cnt <= 1;
    }
}
