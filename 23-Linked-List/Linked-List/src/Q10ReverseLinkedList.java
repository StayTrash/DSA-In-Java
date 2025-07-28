//https://leetcode.com/problems/reverse-linked-list/description/


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

//class Q10ReverseLinkedList {
    //        Recursive
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) {
//            return head;
//        }
//
//        ListNode newHead = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return newHead;
//    }


    // in place reversal of linked list
    // google, microsoft, apple, amazon: https://leetcode.com/problems/reverse-linked-list/
    
    
//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return head;
//        }
//
//        ListNode prev = null;
//        ListNode present = head;
//        ListNode next = present.next;
//
//        while (present != null) {
//            present.next = prev;
//            prev = present;
//            present = next;
//            if (next != null) {
//                next = next.next;
//            }
//        }
//        // head = prev;
//        return prev;
//    }

}