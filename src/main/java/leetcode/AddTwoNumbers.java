package leetcode;

public class AddTwoNumbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int a=0, b=0, temp = 0;
        if (null != l1) {
            a = l1.val;
            l1 = l1.next;
        }
        if (null != l2) {
            b = l2.val;
            l2 = l2.next;
        }
        int cur = a + b + temp;
        temp = cur >= 10 ? 1 : 0;

        return null;
    }
}
