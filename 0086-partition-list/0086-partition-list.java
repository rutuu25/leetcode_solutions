/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode less = new ListNode(0);
        ListNode more= new ListNode(0);
        ListNode lessH= less;
        ListNode moreH= more;

        while(head!=null){
            if(head.val<x){
                less.next= head;
                less= less.next;
            }else{
                more.next= head;
                more =more.next;
            }
            head= head.next;
        }
        more.next=null;
        less.next = moreH.next;
        return lessH.next;
    }
}