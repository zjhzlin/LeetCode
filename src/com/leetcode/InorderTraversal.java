package com.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

    // use recursive
    public List<Integer> Traversal(TreeNode root) {     // inorder traversal
        ArrayList<Integer> result = new ArrayList<Integer>();

        if (root == null) return result;

        // traversal the left node
        if (root.left != null) {
            List<Integer> leftList = Traversal(root.left);
            for (int i = 0; i < leftList.size(); i++)
                result.add(leftList.get(i));
        }

        // traversal the root
        result.add(root.val);

        // traversal the right node
        if (root.right != null) {
            List<Integer> rightList = Traversal(root.right);
            for (int i = 0; i < rightList.size(); i++)
                result.add(rightList.get(i));
        }
        return result;

    }

    // iteratively - use stack!!!
    public List<Integer> IterativeTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (root == null) return result;
        Stack<TreeNode> stack = new Stack<>();

        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while(current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            result.add(current.val);
            current = current.right;

            // go far left
            // update the
        }
        return null;

    }


    public static void main(String[] args) {

    }
}

