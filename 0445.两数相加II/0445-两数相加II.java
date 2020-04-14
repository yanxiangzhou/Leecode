/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {

    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode header = new ListNode(0);
        ListNode tmp = header;
        l1 = reverse(l1);
        l2 = reverse(l2);

        int carry = 0;
        int sum = 0;

        while(l1!=null||l2!=null){
            if(l1!=null&&l2!=null){
                sum = l1.val+l2.val + carry;
                l1 = l1.next;
                l2 = l2.next;
            }else if(l1!=null){
                sum = l1.val+carry;
                l1= l1.next;
            }else{
                sum = l2.val+carry;
                l2 = l2.next;
            }

            carry = sum>=10?1:0;
            sum = sum%10;
            header.next = new ListNode(sum);
            header = header.next;
            if((l1==null || l2==null)&& carry==0){
                header.next = l1!=null?l1:l2;
                return reverse(tmp.next);
            }
        }

        if(carry!=0){
            header.next = new ListNode(carry);
            header.next.next = null;
        }

        return reverse(tmp.next);

    }


    public ListNode reverse(ListNode node){

        ListNode pre = null;
        ListNode next = null;

        while(node!=null){
            next = node.next;
            node.next = pre;
            pre = node;
            node = next;
        }
        return pre;

    }
}