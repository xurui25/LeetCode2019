package solution2;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {val = x;}
}

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = l1;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                int nums = l1.val + l2.val;
                l1.val = nums % 10;
                if (l1.next == null && l2.next != null) {
                    l1.next = new ListNode(0);
                } else if (l1.next != null && l2.next == null) {
                    l2.next = new ListNode(0);
                } else if (l1.next == null && l2.next == null){
                    if (nums / 10 != 0) {
                        l1.next = new ListNode(1);
                    }
                    break;
                }
                l1 = l1.next;
                l2 = l2.next;
                l1.val += nums / 10;
            }
        }
        return head;
    }
}
