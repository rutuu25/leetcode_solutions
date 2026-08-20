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
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 ||head==null||head.next==null){
            return head;
        }
        ListNode tail=head;
        int length=1;
        while(tail.next!=null){
            tail=tail.next;
            length++;
        }
        k=k%length;
        if(k==0){
            return head;
        }
        tail.next=head;

        int steps=length-k-1;
        ListNode nextTail=head;
        for(int i=0;i<steps;i++){
            nextTail=nextTail.next;
        }

        ListNode nextHead=nextTail.next;

        nextTail.next=null;
        
        return nextHead;
    }
}