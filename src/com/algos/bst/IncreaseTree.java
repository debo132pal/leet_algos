package com.algos.bst;

public class IncreaseTree {
    TreeNode first = null;
    TreeNode last =  null;
    public TreeNode increasingBST(TreeNode root) {
        helper( root , null );
        return first;
    }

    private TreeNode helper(TreeNode root ,TreeNode prev) {
        if( root == null ){
            return null;
        }
        TreeNode left  = helper( root.left , root );
        if( first == null ) {
            first = root;
        } else {
            last.right = root;
            last.left  = null;
        }
        last = root;
        helper( root.right , left);
        return root;
    }

    public static void main(String[] args) {
        TreeNode n1= new TreeNode(5);
        TreeNode n2= new TreeNode(3);
        TreeNode n3= new TreeNode(2);
        TreeNode n4= new TreeNode(4);
        TreeNode n5= new TreeNode(1);
        n1.left = n2;
        n2.left = n3;
        n3.left = n5;
        n2.right = n4;

        TreeNode n6 = new TreeNode(6);
        TreeNode n8 = new TreeNode(8);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);

        n1.right = n6;
        n6.right = n8;
        n8.left  = n7;
        n8.right = n9;

        IncreaseTree tree = new IncreaseTree();
        TreeNode t = tree.increasingBST( n1 );
        while ( t != null ){
            System.out.println( t.val);
            System.out.println( t.left);

            t = t.right;
        }
    }
}
