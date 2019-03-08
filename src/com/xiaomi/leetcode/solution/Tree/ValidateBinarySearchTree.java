package com.xiaomi.leetcode.solution.Tree;

import com.xiaomi.leetcode.utils.TreeNode;

/**
 * Auther: Qi Hongwei
 * Date: 1/29/19 18:03
 * Description: https://leetcode.com/problems/validate-binary-search-tree/
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return travel(root);
    }

    private boolean travel(TreeNode root) {
        if (root == null)
            return true;

        if (root.left == null && root.right == null)
            return true;
        else if (root.left == null && root.right != null){
            if (root.right.val <= root.val)
                return false;
        }
        else if (root.left != null && root.right == null){
            if (root.left.val >= root.val)
                return false;
        }
        else {
            if (root.left.val >= root.val || root.right.val <= root.val)
                return false;
        }

        return travel(root.left) && travel(root.right);
    }
}
