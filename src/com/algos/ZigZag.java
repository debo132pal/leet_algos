package com.algos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigZag {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();
        if (root != null) {
            Queue<TreeNode> levelOrder = new LinkedList<>();
            levelOrder.add(root);
            boolean goRight = true;
            while (!levelOrder.isEmpty()) {
                int currSize = levelOrder.size();
                List<Integer> level = new LinkedList<>();
                result.add(level);
                while (currSize > 0) {
                    TreeNode n = levelOrder.poll();
                    if (goRight) {
                        level.add(n.val);
                    } else {
                        level.add(0,n.val);
                    }

                    if (n.left != null)
                        levelOrder.offer(n.left);
                    if (n.right != null)
                        levelOrder.offer(n.right);

                    currSize--;
                }
                goRight = !goRight;
            }

            }
            return result;
        }

    public static void main(String[] args) {
        TreeNode  n1 = new TreeNode(3);
        TreeNode  n2 = new TreeNode(9);
        TreeNode  n3 = new TreeNode(20);
        n1.left  = n2;
        n1.right = n3;
        TreeNode  n4 = new TreeNode(15);
        TreeNode  n5 = new TreeNode(7);
        n3.left = n4;
        n3.right = n5;
        ZigZag  ag = new ZigZag();
        System.out.println( ag.zigzagLevelOrder(n1));
    }

    }

