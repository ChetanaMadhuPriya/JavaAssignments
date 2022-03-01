package com.phase1.assistedprograms;

public class SinglyLinkedList {

	   
	    Node head;
	    static class Node {
	   
	        int data;
	        Node next;
	   
	        Node(int d)
	        {
	            data = d;
	            next = null;
	        }
	    }
	   
	    public static SinglyLinkedList insert(SinglyLinkedList list, int data)
	    {
	        Node new_node = new Node(data);
	        new_node.next = null;
	   
	        if (list.head == null) {
	            list.head = new_node;
	        }
	        else {
	            Node last = list.head;
	            while (last.next != null) {
	                last = last.next;
	            }
	            last.next = new_node;
	        }
	   
	        return list;
	    }
	   
	    public static void printList(SinglyLinkedList list)
	    {
	        Node currNode = list.head;
	    
	        System.out.print("LinkedList: ");
	   
	        while (currNode != null) {
	           
	            System.out.print(currNode.data + " ");
	    
	           
	            currNode = currNode.next;
	        }
	    }
	    
	   
	    public static void main(String args[])
	    {
	        SinglyLinkedList list = new SinglyLinkedList();
	        list = insert(list,10);
	        list = insert(list,20);
	        list = insert(list,30);
	        list = insert(list,40);
	        list = insert(list,50);
	        list = insert(list,60);
	        list = insert(list,70);
	        list = insert(list,80);
	        printList(list);
	    }
	}