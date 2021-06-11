package com.algos.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrder {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if( root != null ){
            Queue<TreeNode> queue = new LinkedList<>() ;
            queue.add( root );
            List<Integer> row = new LinkedList<>();
            row.add( root.val );
            result.add( row );
            while( !queue.isEmpty() ){
                int levelSize = queue.size();
                row = new LinkedList<>();
                for( int i = 0 ; i < levelSize ; i++ ){
                    TreeNode node = queue.poll();
                    if( node.left  != null ) queue.add( node.left);
                    if( node.right != null ) queue.add( node.right);
                    row.add(node.val);
                }
                result.add(row);
            }
        }

        return result;
    }
}
