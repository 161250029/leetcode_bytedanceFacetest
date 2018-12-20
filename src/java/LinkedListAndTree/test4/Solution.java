package LinkedListAndTree.test4;

import LinkedListAndTree.test2.ListNode;

/**
 * 插入排序 ， 效率较低
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null)
            return head;
        ListNode newHead = new ListNode(0);
        ListNode cur=head, pre=newHead, next;
        while(cur != null){                                        //在数组中的for循环在这里都要换成while， 外层循环是对应于遍历整个链表
            next = cur.next;
            if(pre != newHead && pre.val > cur.val)
                pre = newHead;
            while(pre.next != null && pre.next.val < cur.val)   //内存循环是已经排好序的子序列。
                pre = pre.next;
            cur.next = pre.next;
            pre.next = cur;
            cur = next;
        }
        return newHead.next;
    }
}
