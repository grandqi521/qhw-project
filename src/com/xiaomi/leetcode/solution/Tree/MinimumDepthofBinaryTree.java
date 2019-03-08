package com.xiaomi.leetcode.solution.Tree;

import com.xiaomi.leetcode.utils.TreeNode;

/**
 * Auther: Qi Hongwei
 * Date: 2/22/19 09:50
 * Description: https://leetcode.com/problems/minimum-depth-of-binary-tree/
 */
public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = minDepth(root.left);
        int rightDepth = minDepth(root.right);

        return (leftDepth == 0 || rightDepth == 0) ?
                leftDepth + rightDepth + 1 : Math.min(leftDepth, rightDepth) + 1;
    }
}
