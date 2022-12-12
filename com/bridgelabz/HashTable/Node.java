package com.bridgelabz.HashTable;

public class Node {
    /**
     * In linked list data stored noncontinuous memory
     * each node divided two parts one part contain data and another part contain next node address
     */
    String data;
    Node next;

    /**
     *create a parameterized constructor
     */
    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}
