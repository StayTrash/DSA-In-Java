//https://leetcode.com/problems/linked-list-cycle-ii/

////import java.util.List;
////
////public class Solution {
////    public ListNode detectCycle(ListNode head) {
////          int length = 0;
////
////          ListNode fast = head;
////          ListNode slow = head;
////
////            while (fast != null && fast.next != null) {
////                fast = fast.next.next;
////                slow = slow.next;
////
////                if (slow == fast) {
////                    length = lengthCycle(slow);
////                    break;
////                }
////            }
////
////        if (length == 0) {
////            return null;
////        }
////
////        // find the start node
////
////        ListNode f = head;
////        ListNode s = head;
////
////        while (length > 0) {
////            s = s.next;
////            length--;
////        }
////
////        // keep moving both forward and they meet at start
////
////        while (f != s) {
////            f = f.next;
////            s = s.next;
////        }
////
////        return s;
////    }
////    public int lengthCycle(ListNode head) {
////        ListNode fast = head;
////        ListNode slow = head;
////
////        while (fast != null && fast.next != null) {
////            fast = fast.next.next;
////            slow = slow.next;
////            if (fast == slow) {
////                // calculate the length
////
////                ListNode temp = slow;
////                int length = 0;
////                do {
////                    temp = temp.next;
////                    length++;
////                } while (temp != slow);
////                return length;
////            }
////        }
////        return 0;
////    }
////}
//
///**
// * Definition for singly-linked list.
// * class ListNode {
// *     int val;
// *     ListNode next;
// *     ListNode(int x) {
// *         val = x;
// *         next = null;
// *     }
// * }
// */


// better way
//public class Solution {
//    public ListNode detectCycle(ListNode head) {
//        ListNode first = head;
//        ListNode second = head;
//
//        if (first == null || first.next == null) {
//            return null;
//        }
//
//        while (first != null && first.next != null) {
//            second = second.next;
//            first = first.next.next;
//
//            if (first == second) {
//                first = head;
//                while (first != second) {
//                    second = second.next;
//                    first = first.next;
//                }
//                return first;
//            }
//        }
//        return null;
//    }
//}