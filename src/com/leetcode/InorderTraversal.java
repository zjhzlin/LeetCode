package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {

//    public List<Integer> Traversal(TreeNode root) {
//        if (root == null) return null;
//        TreeNode current = root;
//        ArrayList<Integer> result = new ArrayList<Integer>();
//        while (current != null) {
//            TreeNode parent = null;
//            while (current.left != null) {
//                parent = current;
//                current = current.left;
//            }
//            result.add(current.val);
//            current = parent;
//        }
//
//    }

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

    public List<Integer> Traversal(TreeNode root) {
        if (root == null) return null;
        ArrayList<Integer> result = new ArrayList<Integer>();

        // traversal the left node
        r
        // traversal the root

        // traversal the right node

    }

    public static void main(String[] args) {

    }
}

