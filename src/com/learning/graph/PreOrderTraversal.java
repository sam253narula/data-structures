package com.learning.graph;



import java.util.*;

 class Node{
     int data;
     Node left,right;
     Node(int d){
         data=d;
         left=right=null;
     }
 }

public class PreOrderTraversal {

    Node root;

    ArrayList<Integer> PreOrderTraversal(){
       return preorder(root);
    }

    //Function to return a list containing the preorder traversal of the tree.
    private static ArrayList<Integer> preorder(Node root)
    {
        // Code here
        if(root == null){
            return null;
        }

        ArrayList<Integer> results = new ArrayList<Integer>();
        Stack<Node> nodeStack = new Stack<>();
        nodeStack.push(root);
        while(nodeStack.empty() == false){
            Node currentNode = nodeStack.peek();
            results.add(currentNode.data);
            nodeStack.pop();
            if(currentNode.right != null)
            nodeStack.push(currentNode.right);
            if(currentNode.left != null)
            nodeStack.push(currentNode.left);
        }
        return results;
    }


    public static void main(String[] args) {
        PreOrderTraversal tree = new PreOrderTraversal();
        tree.root = new Node(10);
        tree.root.left = new Node(8);
        tree.root.right = new Node(2);
        tree.root.left.left = new Node(3);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(2);
        ArrayList<Integer> result  = tree.PreOrderTraversal();
        System.out.println(result);
    }
}
