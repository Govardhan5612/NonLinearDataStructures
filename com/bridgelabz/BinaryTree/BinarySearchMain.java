package com.bridgelabz.BinaryTree;

/**
 * @author Govardhan Reddy
 */
public class BinarySearchMain {
    /**
     * print the binary search tree
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
        System.out.println();
        tree.insertData(22);
        tree.printData();
        System.out.println();
        tree.insertData(40);
        tree.printData();
        System.out.println();
        tree.insertData(11);
        tree.printData();
        System.out.println();
        tree.insertData(3);
        tree.printData();
        System.out.println();
        tree.insertData(16);
        tree.printData();
        System.out.println();
        tree.insertData(60);
        tree.printData();
        System.out.println();
        tree.insertData(95);
        tree.printData();
        System.out.println();
        tree.insertData(65);
        tree.printData();
        System.out.println();
        tree.insertData(63);
        tree.printData();
        System.out.println();
        tree.insertData(67);
        tree.printData();
        System.out.println();
        if (tree.search(tree.root, 63) == true) {
            System.out.println("63 is present in tree");
        } else {
            System.out.println("63 is not present in tree");
        }

    }
}
