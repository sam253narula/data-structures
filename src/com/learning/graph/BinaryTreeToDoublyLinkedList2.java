package com.learning.graph;


import java.util.ArrayList;
import java.util.Collections;
// refer diagram BTTODLL
public class BinaryTreeToDoublyLinkedList2 {
    Node headLinkedList;

    Node prev;

    // A simple recursive function to convert a given
    // Binary tree to Doubly Linked List

    public void bstToDoublyLinkedList(Node node) {
        //base  case
        if (node == null) {
            return;
        }

        bstToDoublyLinkedList(node.left);

        if (prev == null) {
            headLinkedList = node;
            prev = node;
        } else {
            node.left = prev;
            prev.right = node;
            prev = node;
        }

        bstToDoublyLinkedList(node.right);


    }

    // Utility function for printing double linked list.
    void printList(Node head) {
        System.out.println("Extracted Double Linked List is : ");
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.right;
        }
    }

    // Driver program to test the above functions
    public static void main(String[] args) {
        /* Constructing below tree
               5
             /   \
            3     6
           / \     \
          1   4     8
         / \       / \
        0   2     7   9  */

        BinaryTreeToDoublyLinkedList2 tree = new BinaryTreeToDoublyLinkedList2();
        tree.headLinkedList = new Node(5);
        tree.headLinkedList.left = new Node(3);
        tree.headLinkedList.right = new Node(6);
        tree.headLinkedList.left.right = new Node(4);
        tree.headLinkedList.left.left = new Node(1);
        tree.headLinkedList.right.right = new Node(8);
        tree.headLinkedList.left.left.right = new Node(2);
        tree.headLinkedList.left.left.left = new Node(0);
        tree.headLinkedList.right.right.left = new Node(7);
        tree.headLinkedList.right.right.right = new Node(9);

        tree.bstToDoublyLinkedList(tree.headLinkedList);
        tree.printList(tree.headLinkedList);

    }
}

