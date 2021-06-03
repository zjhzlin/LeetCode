package com.leetcode;

public class AddTwoNumbers {

     // Definition for singly-linked list.
      public class ListNode {
         int val;
         ListNode next;

         ListNode() {
         }

         ListNode(int val) {
             this.val = val;
         }

         ListNode(int val, ListNode next) {
             this.val = val;
             this.next = next;
         }
     }

     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode sum = new ListNode(0);
            int add = 0;
            ListNode curr = sum;
            while( l1 != null || l2 != null ) {
                // int sumVal = l1.val + l2.val + add; // wrong: because l1 or l2 may be null
                int x = ( l1 != null) ? l1.val : 0;
                int y = ( l2 != null) ? l2.val : 0;
                int sumVal = x + y + add;
//                if (sumVal >= 10) add = 1;
//                else add = 0;
                add = sumVal / 10;
                curr.next = new ListNode(sumVal % 10);
                if(l1 != null) l1 = l1.next;
                if(l2 != null) l2 = l2.next;
                curr = curr.next;
            }
            if (add > 0) {
                curr.next = new ListNode(add);
            }
            return sum.next;
      }





}
