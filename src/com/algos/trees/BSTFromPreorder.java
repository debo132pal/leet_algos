package com.algos.trees;

public class BSTFromPreorder {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
    }

    public TreeNode bstFromPreorder(int[] preorder) {
            return  bstFromPreorder( preorder, 0 , preorder.length - 1 );
    }

    private TreeNode bstFromPreorder(int[] preorder, int start, int end) {

        TreeNode root = null;
        if( start <= end ) {
            root = new TreeNode();
            root.val = preorder[start];
            int idx = -1;
            for( int i = start + 1 ; i <= end ; i++ ) {
                if( preorder[start] < preorder[i] ) {
                    idx = i;
                    break;
                }
            }
            if( idx >= 0 ) {
                root.left = bstFromPreorder(preorder, start + 1, idx - 1);
                root.right = bstFromPreorder(preorder, idx, end);
            } else {
                root.left = bstFromPreorder(preorder, start + 1, end);
                root.right = null;
            }
        }

        return root;

      }

      public void printTree( TreeNode node ){
        if( node == null )
            return;
        printTree( node.left );
        System.out.print( node.val + " ");
        printTree( node.right );
      }

    public static void main(String[] args) {
        BSTFromPreorder bst = new BSTFromPreorder();
        int[] t = { 8,5,1,7,10,12 };
        TreeNode t1 = bst.bstFromPreorder( t ) ;
        bst.printTree( bst.bstFromPreorder(t) );
    }

}
