package com.ajavacode.doublylinkedlistimplementation;

public class DoublyLinkedList {

    DlNode head;

    void addStart(int data) {
        DlNode node = new DlNode(data);
        if (head == null) {
            head = node;
        }
        else {
            node.next = head;
            head.previous = node;
            node = head;
        }
    }

    void addAfterRecursive(DlNode current, int insertAfter, int data) {
        if (current == null) {
            return;
        }
        if (current.data == insertAfter){
            DlNode node = new DlNode(data);
            if (current.next != null) {
                current.next.previous = node;
                node.next = current.next;
            }
            current.next = node;
            node.previous = current;
        }
    }

    void addLast(int data) {
        DlNode node = new DlNode(data);
        if (head == null) {
            head = node;
        }
        else {
            DlNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node.previous = current;
        }
    }

    DlNode deleteStart() {
        DlNode toDelete = head;
        if (head == null || head.next == null) {
            head = null;
        }
        else {
            head = head.next;
            head.previous = null;
        }
        return toDelete;
    }

    DlNode deleteAfter(int data) {
        DlNode toDelete = head;
        for (; toDelete != null; toDelete = toDelete.next){
            if (toDelete.data == data) {
                toDelete = toDelete.next;
                break;
            }
        }
        if (toDelete != null) {
            if (toDelete.next != null) {
                toDelete.next.previous = toDelete.previous;
            }
            toDelete.previous.next = toDelete.next;
        }
        return toDelete;
    }

    DlNode deleteLast() {
        DlNode toDelete = head;
        if (head == null || head.next == null) {
            head = null;
            return toDelete;
        }
        while (toDelete.next != null){
            toDelete = toDelete.next;
        }
        return toDelete.previous.next = null;
    }

    void display() {
        DlNode current = head;
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }
        else {
            System.out.println("Nodes of doubly linked list:");
            while (current != null) {
                System.out.println(current.data + "->");
                current = current.next;
            }
        }
    }
}
