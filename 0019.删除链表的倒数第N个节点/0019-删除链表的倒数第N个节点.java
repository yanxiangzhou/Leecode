/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode res = new ListNode(-1);
        res.next = head;
        ListNode fast = res;
        ListNode slow = res;

        while (n-- > 0){
            fast = fast.next;
        }
        //Ϊ���ҵ�Ҫɾ���Ľڵ��ǰһ���ڵ㣬���Դ˴���fast.next!=null
        while (fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        //��ʱslowΪ������n���ڵ��ǰһ���ڵ㡣
        slow.next = slow.next.next;
        return res.next;

    }


}