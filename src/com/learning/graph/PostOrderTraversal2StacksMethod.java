package com.learning.graph;

/*Following is detailed algorithm.

1. Push root to first stack.
2. Loop while first stack is not empty
   2.1 Pop a node from first stack and push it to second stack
   2.2 Push left and right children of the popped node to first stack
3. Print contents of second stack*/

import java.util.ArrayList;
import java.util.Stack;

public class PostOrderTraversal2StacksMethod {

    Node root;

    ArrayList<Integer> postOrderTraversal2StacksMethod() {
        return postOrder(root);
    }

    ArrayList<Integer> postOrder(Node root) {
        //LRR Left right root

        ArrayList<Integer> results = new ArrayList<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        if (root == null)
            return null;
        s1.push(root);

        while (!s1.isEmpty()) {
            Node current = s1.pop();
            s2.push(current);

            if (current.left != null) {
                s1.push(current.left);
            }

            if (current.right != null) {
                s1.push(current.right);
            }
        }


        while (!s2.isEmpty()) {
            Node temp = s2.pop();
            results.add(temp.data);
        }

        return results;
    }

    public static void main(String[] args) {
        PostOrderTraversal2StacksMethod tree = new PostOrderTraversal2StacksMethod();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        ArrayList<Integer> result = tree.postOrderTraversal2StacksMethod();
        System.out.println(result);
    }
}
