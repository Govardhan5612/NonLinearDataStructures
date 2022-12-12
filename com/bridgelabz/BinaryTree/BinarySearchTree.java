package com.bridgelabz.BinaryTree;

/**
 * @author Govardhan reddy
 */
public class BinarySearchTree {
    Node root;

    public Node insert(Node root, int data) {
        /**
         * add root and data
         */
        if (root == null) {
            root = new Node(data);
            return root;

        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void insertData(int data) {
        /**
         * root left sub tree or right sub tree
         */
        root = insert(root, data);
    }

    public void print(Node root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    public boolean search(Node root, int input) {
        if (root == null) {
            return false;
        }

        if (root.data == input) {
            return true;
        }

        boolean result1 = search(root.left, input);
        if (result1 == true)
            return true;

        boolean result2 = search(root.right, input);
        return result2;

    }

    public void printData() {
        print(root);
    }

}
