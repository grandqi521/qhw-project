package com.xiaomi.leetcode.solution.List;

import com.xiaomi.leetcode.utils.ListNode;

/**
 * Auther: Qi Hongwei
 * Date: 3/6/19 10:59
 * Description: https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null)
            return  l2;
        if (l2 == null)
            return l1;
        ListNode root = new ListNode(-1);
        ListNode cur = root;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                cur.next = l1;
                cur = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                cur = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null)
            cur.next = l1;
        if (l2 != null)
            cur.next = l2;

        return root.next;
    }

    public ListNode mergeTwoListsV2(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.val < l2.val){
            l1.next = mergeTwoListsV2(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoListsV2(l1, l2.next);
            return l2;
        }
    }
}
