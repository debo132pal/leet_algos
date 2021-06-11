package com.algos.trees;

import java.util.*;

public class VerticalTraversal {
        public List<List<Integer>> verticalTraversal(TreeNode root) {
            LinkedList<List<Integer>> result = new LinkedList<>();
            TreeMap<Integer,  TreeMap<Integer, PriorityQueue<Integer>>> cache =  new TreeMap<>();
            helper( cache , root , 0 ,0 );
            for( Integer e: cache.keySet() ){
                TreeMap<Integer, PriorityQueue<Integer>> ts = cache.get(e);
                LinkedList<Integer> verticalOrder = new LinkedList<>();
                for( PriorityQueue<Integer> pq : ts.values()){
                    for( Integer n :pq) verticalOrder.addLast(n);
                }
                result.addLast(verticalOrder);
            }
            return result;
        }

        private void helper(TreeMap<Integer,  TreeMap<Integer, PriorityQueue<Integer>>> cache, TreeNode root , int d , int level ) {
            if( root == null)
                return ;
            TreeMap<Integer, PriorityQueue<Integer>> vertical = cache.get(d);
            if( !cache.containsKey(d) ){
                vertical = new TreeMap<Integer, PriorityQueue<Integer>>();
                cache.put( d , vertical);
            }

            PriorityQueue<Integer> pq = vertical.get(level);
            if( pq == null ){
                pq = new PriorityQueue<>();
                vertical.put(level , pq);
            }
            pq.add(root.val);
            helper( cache , root.left , d - 1 , level + 1);
            helper( cache , root.right , d + 1 , level + 1 );
        }

    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(3);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(4);
        n1.left  = n2;
        n1.right = n3;
        TreeNode n4 = new TreeNode(0);
        TreeNode n5 = new TreeNode(2);
        TreeNode n6 = new TreeNode(2);
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        VerticalTraversal vt = new VerticalTraversal();
        List<List<Integer>> lists = vt.verticalTraversal(n1);
        System.out.println( lists);
    }
}
