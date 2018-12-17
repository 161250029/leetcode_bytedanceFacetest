package LinkedListAndTree.test1;

//错误原因，不能用值来赋值原来的链表，应该新建一个空的链表来存储
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if(l1 == null )
            return l2;
        if (l2 == null)
            return l1;
        if (l1.val > l2.val) {
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        ListNode result = l1;
            while(l2 != null) {
                if(l2.val >= l1.val ) {
                    if(l1.next != null && l2.val <= l1.next.val ) {
                        ListNode temp = l1.next;
                        ListNode temp2 = l2.next;
                        l1.next = l2;
                        l2.next = temp;
                        l2 = temp2;
                        l1 = l1.next;
                    }
                    else if ( l1.next != null) {
                        l1.next = l2;
                        l2 = l2.next;
                        l1 = l1.next;
                    }
                }
            }
            return result;
    }
}
