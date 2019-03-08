package com.xiaomi.leetcode.solution.Tree;

import com.xiaomi.leetcode.utils.TreeNode;

/**
 * Auther: Qi Hongwei
 * Date: 1/28/19 15:59
 * Description: https://leetcode.com/problems/sum-root-to-leaf-numbers/
 */
public class SumRoot2LeafNumbers {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }

    public int sum(TreeNode root, int s) {
        if (root == null) return 0;
        if (root.right == null && root.left == null) return s * 10 + root.val;
        return sum(root.left, s * 10 + root.val) + sum(root.right, s * 10 + root.val);
    }

}
