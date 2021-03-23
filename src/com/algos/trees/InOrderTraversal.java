package com.algos.trees;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if( root == null )
            return result;
        Stack<TreeNode> order = new Stack<>();
        order.push(root);


        while( !order.isEmpty() ){
            TreeNode n = order.peek();
            while( n.left != null ) {
                order.push(n.left);
                n = n.left;
            }
            n = order.pop();
            result.add( n.val);
            System.out.println( n.val);
            if( n.right != null )
                order.push( n.right );


        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode( 1);
        TreeNode t2 = new TreeNode( 2 );
        t1.right = t2;
        TreeNode t3 = new TreeNode( 3 );
        t2.left = t3;
        InOrderTraversal traversal = new InOrderTraversal();
        traversal.inorderTraversal(t1);
    }

}
