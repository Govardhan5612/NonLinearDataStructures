package com.bridgelabz.BinaryTree;

/**
 * @author Govardhan Reddy
 */
public class BinarySearchMain {
    /**
     *print the binary search tree
     */
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertData(56);
        tree.printData();
        System.out.println();
        tree.insertData(30);
        tree.printData();
        System.out.println();
        tree.insertData(70);
        tree.printData();

    }
}
