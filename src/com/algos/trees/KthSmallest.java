package com.algos.trees;

public class KthSmallest {

    static TreeNode result = null;
    public int kthSmallest(TreeNode root, int k) {
        KthSmall( root , k );
        return result.val;

    }


    public int KthSmall( TreeNode root , int k ){
        if ( root == null )
            return 0;
        else {

            int l = KthSmall( root.left , k );
            if ( l + 1 == k ) {
                result = root;
                return 0;
            }
            int r = KthSmall( root.right , k - (l + 1 ) );

            return 1 + r + l;
        }

    }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(4);
        TreeNode n4 = new TreeNode(2);
        n2.right = n4;
        n1.left  = n2;
        n1.right = n3;

        System.out.println( new KthSmallest().kthSmallest( n1, 1));
    }


}
