/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication63.linkedlist;

/**
 *
 * @author PROGRAMMER
 */
public class JavaApplication63LinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(4);

    }

}

class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node {

        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    public LinkedList(int value) {

        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

}
