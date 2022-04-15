package com.personal.codeprep;

public class MiddleElementInLinkedLists {

	
	
	static Node head;
	
	
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data=d;
			this.next=null;
		}
		
		//Function to print the middle of the linkedlist.
		 void printMiddle() {
			
			Node slow_ptr = head;
			Node fast_ptr= head;
			
			while(fast_ptr!=null && fast_ptr.next!=null) {
				slow_ptr= slow_ptr.next;
				fast_ptr= fast_ptr.next.next;
			}
			//System.out.println("The middle element of the linkedlist is :" slow_ptr.data);
		}
		
		public void push(int new_Data) {
			
			Node new_node= new Node(new_Data);
			new_node.next= head;
			head= new_node.next;
			
		}
		
		public void printList() {
			Node tnode = head;
			if(tnode!=null) {
				System.out.println(tnode.data + "->");
			}
			System.out.println("Null");
		}
	}
}
