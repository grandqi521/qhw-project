package com.xiaomi.leetcode.solution.Tree;

import com.xiaomi.leetcode.utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Auther: Qi Hongwei
 * Date: 1/28/19 11:49
 * Description: https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class ZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        travel(root, res, 0);
        return res;
    }

    public void travel(TreeNode curr, List<List<Integer>> res, int level) {
        if (curr == null) return;

        if (res.size() <= level) {
            List<Integer> nodes = new LinkedList<>();
            res.add(nodes);
        }

        List<Integer> nodes = res.get(level);
        if (level % 2 == 0) {
            nodes.add(curr.val);
        } else {
            nodes.add(0, curr.val);
        }

        travel(curr.left, res, level + 1);
        travel(curr.right, res, level + 1);
    }

}
