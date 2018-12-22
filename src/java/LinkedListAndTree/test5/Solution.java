package LinkedListAndTree.test5;

import java.util.HashMap;
import java.util.Map;

/**
 * 基本算是一次就过，但效率不高
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null || head.next == null)
            return null;
        int index = 0 ;
        Map<ListNode , Integer> map = new HashMap<ListNode , Integer>();
        while(head.next != null && map.get(head.next) == null) {
            map.put(head , index);
            index ++;
            head = head.next;
        }
        if(head.next == null)
            return null;
        else
            return head.next;
    }
}
