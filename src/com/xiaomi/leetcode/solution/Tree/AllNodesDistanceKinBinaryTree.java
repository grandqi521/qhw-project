package com.xiaomi.leetcode.solution.Tree;

import com.xiaomi.leetcode.utils.TreeNode;

import java.util.*;

/**
 * Auther: Qi Hongwei
 * Date: 1/28/19 19:11
 * Description: https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
 */
public class AllNodesDistanceKinBinaryTree {
    Map<TreeNode, Integer> map = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        List<Integer> res = new LinkedList<>();
        find(root, target);
//        for (Map.Entry<TreeNode, Integer> entry : map.entrySet()){
//            System.out.println("Key = " + entry.getKey().val + ", Value = " + entry.getValue());
//        }
        dfs(root, target, K, map.get(root), res);
        return res;
    }

    // find target node first and store the distance in that path that we could use it later directly
    private int find(TreeNode root, TreeNode target) {
        if (root == null) return -1;
        if (root == target) {
            map.put(root, 0);
            return 0;
        }
        int left = find(root.left, target);
        if (left >= 0) {
            map.put(root, left + 1);
            return left + 1;
        }
        int right = find(root.right, target);
        if (right >= 0) {
            map.put(root, right + 1);
            return right + 1;
        }
        return -1;
    }

    private void dfs(TreeNode root, TreeNode target, int K, int length, List<Integer> res) {
        if (root == null) return;
        if (map.containsKey(root)) length = map.get(root);
        if (length == K) res.add(root.val);
        dfs(root.left, target, K, length + 1, res);
        dfs(root.right, target, K, length + 1, res);
    }
}