package com.bridgelabz.linkedlist;

import com.bridgelabz.linkedlist.Node;

public class LinkedList {
    Node head;
    void addFirst(int data){
        Node newNode = new Node(data);
        if(head ==null){
            head =newNode;
            return;
        }
        newNode.next=head;
        head =newNode;
    }

    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}


