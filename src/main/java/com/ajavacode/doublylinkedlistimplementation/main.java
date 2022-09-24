package com.ajavacode.doublylinkedlistimplementation;

public class main {
    public static void main (String[] args) {

        DoublyLinkedList dlList = new DoublyLinkedList();
        dlList.addStart(1);
        dlList.addAfterRecursive(dlList.head,1,30);
        dlList.addLast(20);
        dlList.deleteAfter(1);
        dlList.deleteStart();
        dlList.deleteLast();

        dlList.display();
    }
}
