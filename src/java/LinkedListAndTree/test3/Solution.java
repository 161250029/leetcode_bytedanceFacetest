package LinkedListAndTree.test3;

import LinkedListAndTree.test2.ListNode;

//完美的算法，速度很快
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode node = new ListNode(0);
        ListNode result = node;     //头结点                          //特别注意：申明了头结点之后 ，所连接的结点就不能new了,再new的话就找不到索引了
        int carry = 0;
        while(l1 != null || l2 != null)   {
            int val1 = 0;
            int val2 =0;
            if(l1 != null) {
                val1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null) {
                val2 = l2.val;
                l2 = l2.next;
            }
            int val = (val1 + val2 + carry) % 10;
            carry = (val1 + val2 + carry) / 10;
            node.next = new ListNode(val);
            node = node.next;
        }
        if(carry != 0) {
            node.next = new ListNode(carry);
        }
        return result.next;
    }
    public static void main(String args[]) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node4.next = node5;
        node5.next = node6;
        solution.addTwoNumbers(node1 , node4);
    }
}
