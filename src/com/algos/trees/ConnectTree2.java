package com.algos.trees;

public class ConnectTree2 {
   static  class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if( root == null )
            return null;

        Node start  = root;
        while ( start != null ) {
         Node curr = start;
         start = null;
         Node prev = null;
         //System.out.println();
         while ( curr != null ){
        //     System.out.print( curr.val +"   ");
             Node left  = curr.left;
             Node right = curr.right;
             if( start == null ){
                 start = ( left == null ) ? right : left;
             }
             // start of next level
             if ( left == null && right == null ){
             } else if ( right == null ) {
                 if( prev == null )  prev = left;
                 else {
                     prev.next = left;
                     prev = prev.next;
                 }

             } else if ( left == null ) {
                 if( prev == null )  prev = right;
                 else{
                     prev.next = right;
                     prev = prev.next;
                 }
             } else {
                 left.next = right;
                 if( prev != null) prev.next = left;
                 prev = right;
             }
             curr = curr.next;
         }

        }
        return root;

    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(4);
        Node n4 = new Node(1);
        Node n5 = new Node(5);
        Node n6 = new Node(1);

        Node n7 = new Node(3);
        Node n8 = new Node(-1);
        n3.left  = n7;
        n3.right = n8;

        Node n9 = new Node(6);
        Node n10 = new Node(8);
        n7.right = n9;
        n8.right = n10;

        n1.left  = n2;
        n1.right = n3;

        n2.left  = n4;
        n4.left  = n5;
        n4.right = n6;




        ConnectTree2 tree2 = new ConnectTree2();
        n1 = tree2.connect(n1);

    }

}
