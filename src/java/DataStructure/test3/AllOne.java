package DataStructure.test3;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;

class AllOne {

    /** Initialize your data structure here. */
   Queue<String> maxQueue;                 //保存最大值队列
   Queue<String> minQueue;                 //保存最小值队列
   HashSet<String> hashSet;
    public AllOne() {
        this.hashSet = new HashSet<>();
        this.maxQueue = new ArrayDeque<>();
        this.minQueue = new ArrayDeque<>();
    }

    /** Inserts a new key <Key> with value 1. Or increments an existing key by 1. */
    public void inc(String key) {
        if (hashSet.contains(key)) {

        }
    }

    /** Decrements an existing key by 1. If Key's value is 1, remove it from the data structure. */
    public void dec(String key) {

    }

    /** Returns one of the keys with maximal value. */
    public String getMaxKey() {

    }

    /** Returns one of the keys with Minimal value. */
    public String getMinKey() {

    }
}
