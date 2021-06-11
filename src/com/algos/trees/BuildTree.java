package com.algos.trees;

public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper( preorder , 0 , preorder.length - 1 , inorder , 0 , inorder.length -1);

    }

    private TreeNode helper(int[] preorder, int startP, int endP, int[] inorder, int startI, int endI ) {
        if ( startP > endP )
            return null;
        else {
            TreeNode n = new TreeNode( preorder[startP] );
            int idx = -1;
            for( int i = startI ; i <= endI ; i++ ){
                if( inorder[i] == n.val ){
                    idx = i;
                    break;
                }

            }
            if( idx >= 0 ){
                int leftLen = idx - startI;
                n.left  = helper( preorder , startP + 1 ,  startP + leftLen , inorder , startI , idx - 1 );
                n.right = helper( preorder , startP + leftLen + 1 , endP , inorder , idx + 1 , endI );
            }
           return n;
        }
    }

    public static void main(String[] args) {
        int[] inorder =  { 4, 2, 5, 1 , 3};
        int[] preorder = { 1, 2 ,4 ,5 , 3};
        BuildTree tree = new BuildTree();
         TreeNode n =  tree.buildTree(preorder,inorder);
        System.out.println( n.val);
        System.out.println( n.right.val);
        System.out.println( n.left.val);
        System.out.println( n.left.left.val);
        System.out.println( n.left.right.val);
        }
}
