package com.learning.graph;

import java.util.ArrayList;

public class PostOrderTraversalRecursiveMethod {

    Node root;

    ArrayList<Integer> postOrderTraversalRecursiveMethod() {
        return postOrder(root);
    }

    ArrayList<Integer> results = new ArrayList<>();

    ArrayList<Integer> postOrder(Node root) {
        // Your code goes here
        // left right root
        if (root == null) {
            return null;
        }
        postOrder(root.left);
        postOrder(root.right);
        results.add(root.data);
        return results;
    }

    public static void main(String[] args) {
        PostOrderTraversalRecursiveMethod tree = new PostOrderTraversalRecursiveMethod();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        System.out.println(tree.postOrderTraversalRecursiveMethod());
    }
}
