package LinkedListAndTree.test2;

public class Solution {
    public ListNode reverseList(ListNode head) {
          ListNode result = new ListNode(0);
          ListNode temp2 = null;
          result.next = null;
          ListNode temp = result.next;
          while (head != null) {
              temp = result.next;
              result.next = head;
              temp2 = head.next;                            //这步需要保存 ，少了这步会导致下一步将head.next改变 ，进而将head改错
              result.next.next = temp;
              head = temp2;
          }
          return result.next;
    }

    public static void main(String args[]) {
        Solution solution = new Solution();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;
        solution.reverseList(node1);
    }
}
