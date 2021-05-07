package com.algos.linkedlist;

public class ReverseLinkList {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode reverseList(ListNode head) {
        if( head == null || head.next == null )
            return head;
        ListNode h = reverseList( head.next );
        head.next.next = head;
        head.next = null;
        return h;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {

       ListNode curr = head;
       ListNode prev = null;
       ListNode toBeHead = null;
       int count = 1;
       while ( curr != null ){
           if( count == left ){
               toBeHead = prev;
               break;
           }
           prev = curr;
           curr = curr.next;
           count++;
        }
       if( curr == null )
           return head;


       for ( int i = left ; i <= right  ; i++ ){
           ListNode temp = curr.next;
           curr.next = prev;
           prev = curr;
           curr = temp;

       }
        if ( toBeHead == null ){
            head.next = curr;
            return prev;
        } else {
            toBeHead.next.next = curr;
            toBeHead.next = prev;
        }
       return head;

    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode( 1 );
        ListNode n2 = new ListNode( 2 );
        ListNode n3 = new ListNode( 3 );
        ListNode n4 = new ListNode( 4 );
        ListNode n5 = new ListNode( 5 );
         n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        ReverseLinkList ll = new ReverseLinkList();
        ListNode x = ll.reverseBetween( n1, 2, 4 );
        print( x );
    }

    private static void print(ListNode n1) {
        while( n1 != null ){
            System.out.print(  n1.val + " --->") ;
            n1 = n1.next;
        }
        System.out.println();
    }
}
