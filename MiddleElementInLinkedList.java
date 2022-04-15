package com.personal.codeprep;

import java.util.LinkedList;


 class MiddleElementInLinkedList {

	
	//Method to write a particular function to find middleElement
	//This is not the complete code though!.
	
	Node head;
	
	 class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
			this.next=null;
		}
	}
	
	public int printMiddle() {
		Node slow_ptr= head;
		Node fast_ptr=head;
		
		while(fast_ptr!=null && fast_ptr.next!=null) {
			fast_ptr= fast_ptr.next.next;
			slow_ptr=slow_ptr.next;
		}
		System.out.println("Getting out of the loop as next element of FastPointer is null");
		System.out.println("Now just return the data on the slowPointer that will be our middleElement:"+slow_ptr.data);
		return slow_ptr.data;
		
	}
	
	public void push(int new_data) {
		Node new_node= new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	
	
}
