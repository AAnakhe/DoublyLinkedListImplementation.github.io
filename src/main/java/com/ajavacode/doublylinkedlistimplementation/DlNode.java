package com.ajavacode.doublylinkedlistimplementation;

public class DlNode {
    int data;
    DlNode next;
    DlNode previous;

    public DlNode (int data) {
        this.data = data;
        this.next = null;
        this.previous = null;
    }
}
