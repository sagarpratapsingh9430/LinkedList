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
    int popFirst(){
        int temp = head.data;
        System.out.println("Pop data: " + temp);
        head = head.next;
        return temp;
    }


    int popLast()
    {
        Node second_last = head;
        while (second_last.next.next != null) {
            second_last = second_last.next;
        }
        second_last.next = null;
        return head.data;
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
    boolean insertAfter(int searchData, int insertData){
        Node insertNode = new Node(insertData);
        Node searchNode = search(searchData);
        if (searchNode != null){
            Node temp = searchNode.next;
            searchNode.next = insertNode;
            insertNode.next = temp;
            return true;
        }
        return false;
    }
    public boolean popWithKeyValue(int key) {

        Node currentNode = head;
        Node  previousNode = null;
        while(currentNode !=null) {
            if(currentNode.data == key) {
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
        previousNode.next = currentNode.next;
        System.out.println( "The key is found and to be deleted: " + currentNode.data );
        System.out.println("LinkedList after deleted key: ");
        return true;
    }
    public int length() {

        Node temp = this.head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
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


