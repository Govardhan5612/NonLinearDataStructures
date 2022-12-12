package com.bridgelabz.HashTable;

import java.util.ArrayList;

/**
 * @author Govardhan Reddy
 */
public class HashTable {
    public ArrayList<Node> HashTable;
    LinkedList list;

    private String hashFunction(String value) {
        return value;
    }

    public HashTable() {
        HashTable = new ArrayList<Node>();
        list = new LinkedList();
    }

    public void addValue(String value) {

        String hashKey = hashFunction(value);
        Node head = null;
        if (HashTable == null) {
            Node newNode = new Node(hashKey);
            HashTable.add(newNode);
        }
        for (Node node : HashTable) {
            if (node.data.equals(hashKey)) {
                head = node;
            }
        }
        if (head == null) {
            Node newNode = new Node(hashKey);
            HashTable.add(newNode);
            head = newNode;
        }
        list.append(value, head);
        for (Node node : HashTable) {
            if (node.data.equals(hashKey)) {
                node = head;
            }
        }

    }

    public void printHashTable(ArrayList<Node> hashMap) {
        for (Node node : hashMap) {
            System.out.print(node.data + " --> ");
            list.print(node.next);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        String[] stringArray = paragraph.split(" ");
        for (int i = 0; i < stringArray.length; i++) {
            hashTable.addValue(stringArray[i]);
        }

        hashTable.printHashTable(hashTable.HashTable);
    }
}
