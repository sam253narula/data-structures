package com.learning.graph;

//
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Stack;
//
//class Node {
//     int data;
//     Node left, right;
//   Node(int item)    {
//         data = item;
//         left = right = null;
//     }
// }
//public class InorderTraversal {
//
//    ArrayList<Integer> inOrder(Node root)
//    {
//        // Code
//        ArrayList<Integer> results = new  ArrayList<Integer>();
//        if (root == null)
//            return null;
//
//
//        Stack<Node> s = new Stack<Node>();
//        Node curr = root;
//
//        // traverse the tree
//        while (curr != null || s.size() > 0)
//        {
//
//            /* Reach the left most Node of the
//            curr Node */
//            while (curr !=  null)
//            {
//                /* place pointer to a tree node on
//                   the stack before traversing
//                  the node's left subtree */
//                s.push(curr);
//                curr = curr.left;
//            }
//
//            /* Current must be NULL at this point */
//            curr = s.pop();
//
//            System.out.print(curr.data + " ");
//
//            /* we have visited the node and its
//               left subtree.  Now, it's right
//               subtree's turn */
//            curr = curr.right;
//        }
//        Iterator<Node> iterator = s.iterator();
//        while (iterator.hasNext()) {
//            results.add(iterator.next().data);
//
//        }
//        return results;
//
//    }
//
//    public static void main(String[] args) {
//
//    }
//
//
//}
