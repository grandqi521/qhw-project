package com.xiaomi.leetcode.solution.List;

import com.xiaomi.leetcode.utils.ListNode;

/**
 * Auther: Qi Hongwei
 * Date: 2/25/19 10:55
 * Description: https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        ListNode pre = head;
        ListNode cur = head.next;
        pre.next = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}
