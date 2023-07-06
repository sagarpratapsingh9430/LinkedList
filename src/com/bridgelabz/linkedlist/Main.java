package com.bridgelabz.linkedlist;

import com.bridgelabz.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.addFirst(70);
        linkedList1.addFirst(30);
        linkedList1.addFirst(56);
        linkedList1.print();

        LinkedList linkedList2 = new LinkedList();
        linkedList2.addLast(70);
        linkedList2.addLast(30);
        linkedList2.addLast(56);
        linkedList2.print();

        linkedList2.search(40);
        linkedList1.search(30);
    }
}
