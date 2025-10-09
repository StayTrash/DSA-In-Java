//public class Q12PalindromeLinkedList {
//    // linkedin, google, facebook, microsoft, amazon, apple
////    https://leetcode.com/problems/palindrome-linked-list/
////    https://leetcode.com/problems/palindrome-linked-list/
//    public boolean isPalindrome(ListNode head) {
//        ListNode mid = middleNode(head);
//        ListNode headSecond = reverseList(mid);
//        ListNode rereverseHead = headSecond;
//
//        // compare both the halves
//        while (head != null && headSecond != null) {
//            if (head.val != headSecond.val) {
//                break;
//            }
//            head = head.next;
//            headSecond = headSecond.next;
//        }
//        reverseList(rereverseHead);
//
//        return head == null || headSecond == null;
//    }
//
//    public ListNode reverseList(ListNode head) {
//        if (head == null) {
//            return head;
//        }
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
//        return prev;
//    }
//
//    public ListNode middleNode(ListNode head) {
//        ListNode s = head;
//        ListNode f = head;
//
//        while (f != null && f.next != null) {
//            s = s.next;
//            f = f.next.next;
//        }
//        return s;
//    }
//}


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
//class Solution {
//    public boolean isPalindrome(ListNode head) {
//        ListNode slow = head;
//        ListNode fast = head;
//        ListNode prev = null;
//        ListNode next = null;
//        ListNode dummy = head;
//        // if(head.next == null)return true;
//
//        while(fast!=null && fast.next != null){
//            slow=slow.next;
//            fast=fast.next.next;
//        }
//        ListNode curr = slow ;
//        while(curr != null){
//            next = curr.next;
//            curr.next = prev;
//            prev = curr;
//            curr = next;
//        }
//        while(prev != null){
//            if(dummy.val != prev.val){
//                return false;
//            }
//            dummy = dummy.next;
//            prev = prev.next;
//        }
//        return true;
//    }
//}
