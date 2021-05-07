package com.algos.trees;

public class DiameterOfTree {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int v = helper( root );
        return max;
    }

    private int helper(TreeNode root) {
        if( root == null )
            return 0;
        int left = helper( root.left);
        int right = helper( root.right);
        int d = 1 + left + right;
        max = Math.max( d , max);
        return d;
    }
}
