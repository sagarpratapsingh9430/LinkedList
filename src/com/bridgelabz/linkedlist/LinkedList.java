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

    void addLast(int data){
        Node node = new Node(data);
        if (head == null){
            head = node;
            return;
        }
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    public Node search(int data){
        Node temp = head;
        while (temp != null){
            if (temp.data == data){
                System.out.println("Data found: " + data);
                return temp;
            }
            temp = temp.next;
        }
        System.out.println("Data not found: " + data);
        return null;
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


