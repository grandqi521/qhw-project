package com.xiaomi.leetcode.solution.List;

import com.xiaomi.leetcode.utils.ListNode;

/**
 * Auther: Qi Hongwei
 * Date: 1/28/19 11:06
 * Description: https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        // write your code here
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            ListNode cur = new ListNode(0);
            int sum = (l1 == null ? 0:l1.val) + (l2 == null ? 0:l2.val) + carry;
            cur.val = sum % 10;
            carry = sum / 10;
            prev.next = cur;
            prev = cur;

            l1 = l1 == null ? l1:l1.next;
            l2 = l2 == null ? l2:l2.next;
        }

        return head.next;
    }
}




