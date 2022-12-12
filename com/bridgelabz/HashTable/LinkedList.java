package com.bridgelabz.HashTable;

/**
 * @author Govardhan Reddy
 */
public class LinkedList {
    public void append(String data,Node head) {
        /**
         * create link list append method
         */
        Node newNode = new Node(data);
        Node temp = head;
        if (head == null) {
            head = newNode;
        } else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void print(Node head) {
        /**
         * print the linked list
         */
        if (head == null) {
            System.out.println("Linked list is empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ,");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
