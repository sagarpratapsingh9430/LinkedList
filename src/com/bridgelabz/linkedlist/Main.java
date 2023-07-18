package com.bridgelabz.linkedlist;

import com.bridgelabz.linkedlist.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList1 = new LinkedList();
        linkedList1.addFirst(70);
        linkedList1.addFirst(30);
        linkedList1.addFirst(56);
        linkedList1.print();
        System.out.println();
        System.out.println("Insert after search data: ");
        linkedList1.insertAfter(30,40);
        linkedList1.print();
        System.out.println("Delete first data: ");
        linkedList1.popFirst();
        linkedList1.print();
        System.out.println("Delete last data: ");
        linkedList1.popLast();
        linkedList1.print();
        System.out.println();
        LinkedList linkedList2 = new LinkedList();
        linkedList2.addLast(70);
        linkedList2.addLast(30);
        linkedList2.addLast(40);
        linkedList2.addLast(50);
        linkedList2.addLast(56);
        linkedList2.popWithKeyValue(40);
        linkedList2.print();
        System.out.println( linkedList2.length() + ": Size of linked list after deleting the key");




    }
}
