package com.algos.linkedlist;

public class ToDoublyList {
    static class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }

    ;

    public void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    Node last = null;
    Node first = null;

    public Node treeToDoublyList(Node root) {
        last = null;
        first = null;
        helper(root);
        first.left = last;
        last.right = first;
        return first;
    }

    private Node helper(Node node) {

        if (node == null)
            return null;
        Node left = helper(node.left);
        if (first == null && node.left == null) {
            first = node;
        }
        if (last != null) {
            last.right = node;
            node.left = last;
        }
        last = node;
        Node right = helper(node.right);
        return node;
    }


    public static void main(String[] args) {
        Node n1 = new Node(4);
        Node n2 = new Node(2);
        Node n3 = new Node(5);
        n1.left = n2;
        n1.right = n3;
        Node n4 = new Node(1);
        Node n5 = new Node(3);
        n2.left = n4;
        n2.right = n5;
        ToDoublyList dl = new ToDoublyList();
        Node first = dl.treeToDoublyList(n1);
        System.out.println(first.val);
        System.out.println(first.right.val);
        System.out.println(first.right.right.val);
        System.out.println(first.right.right.right.val);
        System.out.println(first.right.right.right.right.val);
        System.out.println(first.right.right.right.right.right.val);
        System.out.println("***************");

        System.out.println(first.val);
        System.out.println(first.left.val);
        System.out.println(first.left.left.val);
        System.out.println(first.left.left.left.val);
        System.out.println(first.left.left.left.left.val);
        System.out.println(first.left.left.left.left.left.val);


        Node n6 = new Node(4);
        Node n7 = new Node(2);
        Node n8 = new Node(5);

        n7.right = n6;
        n6.right = n8;
        Node f = dl.treeToDoublyList(n7);
        System.out.println("**************");
        System.out.println(f.val);
        System.out.println(f.right.val);
        System.out.println(f.right.right.val);
        System.out.println(f.right.right.right.val);
        System.out.println(f.right.right.right.right.val);
        System.out.println(f.right.right.right.right.right.val);
        System.out.println("***************");

        System.out.println(f.val);
        System.out.println(f.left.val);
        System.out.println(f.left.left.val);
        System.out.println(f.left.left.left.val);
        System.out.println(f.left.left.left.left.val);
        System.out.println(f.left.left.left.left.left.val);

    }
}


