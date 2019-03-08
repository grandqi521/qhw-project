package com.xiaomi.leetcode.solution.Set;

import java.util.*;

/**
 * Auther: Qi Hongwei
 * Date: 3/6/19 14:58
 * Description: https://leetcode.com/problems/design-hashset/
 */
public class MyHashSet {
    BitSet bs = null;
    /** Initialize your data structure here. */
    public MyHashSet() {
        bs = new BitSet(1000000);
    }

    public void add(int key) {
        bs.set(key);
    }

    public void remove(int key) {
        bs.clear(key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
        return bs.get(key);
    }
}
