package com.algos.trees;

public class LCA {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( root == null )
            return null;
        return helper ( root , null , p , q );
    }

    private TreeNode helper(TreeNode node, TreeNode root, TreeNode p, TreeNode q) {
      if( node == null)
          return null;
      if( node.val == p.val  ){
        return node;
      }else if ( node.val == q.val) {
        return node;
      } else {
          TreeNode left  = helper( node.left , node , p , q );
          TreeNode right = helper( node.right , node , p , q );
          if( left != null && right != null )
              return node;
          else if ( left == null && right == null )
              return null;
          else if ( left == null )
              return right;
          else
              return left;
      }
    }
}
