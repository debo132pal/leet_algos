package com.algos.trees;

public class InOrderSuccesor {

    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        TreeNode inorder =null;
        inorder= inorder( root , p );

        return inorder;
    }

    private TreeNode inorder(TreeNode root, TreeNode p ) {
        if (root == null)
            return null;
        else {
            if (p.val >= root.val) {
                return inorder(root.right, p);
            } else if (p.val < root.val) {
                TreeNode r = inorder(root.left, p);
                return (r == null) ? root : r;

            }
        }
        return null;
    }

    public static void main(String[] args) {
        TreeNode  n1 = new TreeNode(5);
        TreeNode  n2 = new TreeNode(3);
        TreeNode  n3 = new TreeNode(6);
        n1.left=n2;
        n1.right = n3;

        TreeNode  n4 = new TreeNode(2);
        TreeNode  n5 = new TreeNode(4);
        n3.left  = n4;
        n3.right = n5;

        TreeNode  n6 = new TreeNode(1);
        n4.left = n6;


        InOrderSuccesor succ = new InOrderSuccesor();

        TreeNode r = succ.inorderSuccessor( n1 , n2);
        if( r != null )
            System.out.println( r.val);
        else
            System.out.println( "Null");
    }
}
