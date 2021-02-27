package com.algos;

public class BSToGst {
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

    public TreeNode bstToGst(TreeNode root) {
        bstToGst( root, 0);
        return root;

    }

    private int bstToGst(TreeNode root , int val) {
        if (root == null)
            return val;
        if (root.left == null && root.right == null) {
            root.val += val;
            return root.val;
        } else {
            int grt = bstToGst(root.right, val);
            root.val += grt;
            return bstToGst(root.left, root.val);
        }
    }

}
