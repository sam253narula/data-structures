package com.learning.graph;

import java.util.ArrayList;

class TreeNode {
    String value;
    TreeNode left;
    TreeNode right;

    public TreeNode(String value) {
        this.value = value;
    }
}

public class TreeAlgorithms {
    static ArrayList<String> results  = new ArrayList<>();
    public static  ArrayList<String> preorderTraversal(TreeNode n) {
        if(n == null)
            return null;
        results.add(n.value);
        preorderTraversal(n.left);
        preorderTraversal(n.right);
        return results;
    }

    public static ArrayList<String> postorderTraversal(TreeNode n) {
        if(n == null)
            return null;
        postorderTraversal(n.left);
        postorderTraversal(n.right);
        results.add(n.value);
        return results;
    }

    public static ArrayList<String> inorderTraversal(TreeNode n) {
        if(n == null)
            return null;
        inorderTraversal(n.left);
       // System.out.println(n.value+" ");
        results.add(n.value);
        inorderTraversal(n.right);
        return results;
    }

    public static TreeNode createData() {
        TreeNode a = new TreeNode("a");
        TreeNode b = new TreeNode("b");
        TreeNode c = new TreeNode("c");
        TreeNode d = new TreeNode("d");
        TreeNode e = new TreeNode("e");
        TreeNode f = new TreeNode("f");
        TreeNode g = new TreeNode("g");

        a.left = b;
        a.right = g;
        b.left = c;
        b.right = d;
        c.left = e;
        e.right = f;

        return a;
    }

    public static void main(String[] args) {
        TreeNode data = createData();
        System.out.println(preorderTraversal(data));
    }
}
