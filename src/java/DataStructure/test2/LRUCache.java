package DataStructure.test2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LRUCache {
    Map<Integer , Integer> LRU;
    ArrayList<Integer> LRUList;
    int capacity;
    int size;

    public LRUCache(int capacity) {
        LRU = new HashMap();
        size = 0;
        this.capacity = capacity;
        LRUList = new ArrayList<Integer>();
    }

    public int get(int key) {
        if (!LRUList.contains(key))
            return -1;
        LRUList.remove((Object)key);
        LRUList.add(key);
        return LRU.get(key);
    }

    public void put(int key, int value) {
        if(size == capacity) {
             int k = LRUList.get(0);
             LRUList.remove(0);
             LRU.remove(k);
             System.out.println(k);
        }
        else {
            size ++;
        }
        LRU.put(key , value);
        LRUList.add(key);
    }

    public static void main(String args[]) {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1 ,1);
        lruCache.put(2 ,2);
        lruCache.get(1);
        lruCache.put(3 ,3);
        lruCache.get(2);
        lruCache.put(4 ,4);
        lruCache.get(1);
        lruCache.get(3);
        lruCache.get(4);
    }
}
