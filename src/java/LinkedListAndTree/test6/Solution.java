package LinkedListAndTree.test6;

import java.util.HashMap;
import java.util.Map;

/**
 * 一次过，但效率不是很高
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode , Integer> listNodeIntegerMap = new HashMap<>();
        while (headA != null) {
            listNodeIntegerMap.put(headA , listNodeIntegerMap.getOrDefault(headA , 0) + 1);
            headA = headA.next;
        }
        ListNode result = null;
        while (headB != null) {
             if (listNodeIntegerMap.get(headB) != null) {
                 result = headB;
                 break;
             }
             headB = headB.next;
        }
        return  result;
    }
}
