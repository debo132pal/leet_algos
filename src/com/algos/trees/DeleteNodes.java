package com.algos.trees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class DeleteNodes {

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        HashSet<Integer> delNodes = new HashSet<>( );
        for( int i = 0 ; i < to_delete.length ; i++ ){
            delNodes.add( to_delete[i] );
        }
        List<TreeNode> result = new LinkedList<>();
        root = helper( root , result , delNodes);
        if( root != null ) {
            result.add(root);
        }
        return result;
    }

    private TreeNode helper(TreeNode root, List<TreeNode> result, HashSet<Integer> delNodes) {
        if( root == null )
            return null;
        root.left = helper( root.left , result , delNodes );
        root.right = helper( root.right , result , delNodes);
        if( delNodes.contains(root.val) ){
            if ( root.left != null )
                result.add(root.left);
            if( root.right != null)
                result.add(root.right);
            return null;
        }

        return root;
    }
}
