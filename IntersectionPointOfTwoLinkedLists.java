package com.personal.codeprep;


import java.io.*;

public class IntersectionPointOfTwoLinkedLists {


	static Node head1 = null;
	static Node head2= null;


	static class Node {
		int data;
		Node next;

		Node(int d){
			this.data=d;
			this.next=null;
		}



		static Node intersectionNode(Node headA, Node headB) {

			Node a= headA;
			while(a!=null) {

				a.data *=-1;
				a = a.next;
			}

			Node b = headB;

			while(b!=null) {
				if(b.data < 0) {
					break;
				}
				b=b.next;
			}
			return b;


		}

		static void formLinkedList() {

			head1 = new Node(3);
			head1.next = new Node(4);
			head1.next.next= new Node(5);
			head1.next.next.next= new Node(6);
			head1.next.next.next.next= new Node(7);
			head1.next.next.next.next.next= new Node(8);



			head2= new Node(11);
			head2.next= head1.next.next.next.next.next;


		}

		public static void main(String args[]) {
			formLinkedList();
			int resultantNode = Math.abs(intersectionNode(head1, head2).data);
			System.out.println(resultantNode);
		}
	}


}
