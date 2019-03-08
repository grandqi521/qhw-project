package com.xiaomi.leetcode.solution.Array;

/**
 * Auther: Qi Hongwei
 * Date: 3/5/19 19:50
 * Description: https://leetcode.com/problems/maximum-subarray/
 */
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 0)
            return 0;
        int maxSum =  nums[0];
        int tmpSum = 0;
        for (int i = 0; i < nums.length; i++){
            tmpSum = Math.max(tmpSum + nums[i], nums[i]);
            if (tmpSum > maxSum){
                maxSum = tmpSum;
            }
        }
        return maxSum;
    }
}
