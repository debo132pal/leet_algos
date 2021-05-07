package com.algos.trees;

import java.util.ArrayList;
import java.util.List;

public class DiameterNArrayTree {

    static class Node {
        public int val;
        public List<Node> children;


        public Node() {
            children = new ArrayList<Node>();
        }

        public Node(int _val) {
            val = _val;
            children = new ArrayList<Node>();
        }

        public Node(int _val,ArrayList<Node> _children) {
            val = _val;
            children = _children;
        }
    };

        private int max = 0;
        public int diameter(Node root) {
            helper( root );
            return max;
        }

        private int helper(Node root) {
          if( root == null )
              return 0;
          if ( root.children.size() == 0 )
              return 1;
          int maxNode = 0;
          int maxFirst = 0 ;
          int maxSecond = 0;
          for( Node n : root.children ){
              int dist = helper(n);
              if( dist > maxSecond ){
                  if( dist > maxFirst ){
                      maxSecond = maxFirst;
                      maxFirst = dist;
                  } else {
                      maxSecond = dist;
                  }
              }
           }
           max = Math.max( max , maxFirst + maxSecond );
           return 1 + maxFirst;
        }


    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        /*n1.children.add(n3);
        n1.children.add(n2);
        n1.children.add(n4);

        n3.children.add(n5);
        n3.children.add(n6);*/

        n1.children.add(n2);
        n2.children.add(n3);
        n2.children.add(n4);
        n3.children.add(n5);
        n4.children.add(n6);

        DiameterNArrayTree nD = new DiameterNArrayTree();
        System.out.println( nD.diameter(n1) );
    }

    }
