package com.algos;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightSideViewOfTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public List<Integer> rightSideView(TreeNode root) {
            List<Integer> result = new LinkedList<>();
            Queue<TreeNode> level = new LinkedList<>();
            if( root != null ){
                level.offer( root );
                result.add( root.val);
                while(  true ){
                    int size = level.size();
                    int i = 0;
                    TreeNode right = null;
                    while ( i < size ){
                        right = level.poll();
                        if( right.left != null )
                            level.offer(right.left);
                        if( right.right != null )
                            level.offer(right.right);
                    }
                    if( right != null )
                        result.add(right.val);
                }

            }
            return result;
    }

}
