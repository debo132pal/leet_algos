package com.algos.graphs;

import java.util.*;

public class CloneGraph {
    class Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }

    public Node cloneGraph(Node node) {
        Map<Integer,Node> visited = new HashMap<>();
        return  helper( node , visited );
    }

    private Node helper(Node node, Map<Integer,Node> visited) {
        if( node == null ) return null;
        if( !visited.containsKey( node.val) ){
            Node n = new Node();
            n.val = node.val;
            visited.put( n.val , n);
            for( Node near: node.neighbors){
                Node x = helper( near , visited );
                n.neighbors.add(x);
            }
            return n;
        } else
            return visited.get( node.val );
    }
}
