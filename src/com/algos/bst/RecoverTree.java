package com.algos.bst;

public class RecoverTree {

        private TreeNode firstNode  = null;
        private TreeNode secondNode = null;
        private TreeNode prevNode   = null;
        public void recoverTree(TreeNode root) {
            traverse( root );
            int temp = firstNode.val;
            firstNode.val = secondNode.val;
            secondNode.val = temp;
        }

        private void traverse(TreeNode root) {
            if( root == null )
                return;
            traverse( root.left );
            if( firstNode == null && root.val < prevNode.val ){
                firstNode = prevNode;
            }
            if( firstNode != null && root.val < prevNode.val ){
                secondNode = root;
            }
            prevNode = root;

            traverse( root.right);

        }


}
