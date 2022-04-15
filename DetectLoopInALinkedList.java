package com.personal.codeprep;

import java.util.*;


/** We will be using Floyd Cycle finding algorithm to detect loop in the linkedList.
 * 
 * @author sidhha5
 *
 */


public class DetectLoopInALinkedList {

	static class Node
	{
	    int data;
	    Node next;
	    
	    Node(int x)
	    {
	        data = x;
	        next = null;
	    }
	}

	
	    public static void makeLoop(Node head, Node tail, int x){
	        if (x == 0) return;
	        
	        Node curr = head;
	        for(int i=1; i<x; i++)
	            curr = curr.next;
	        
	        tail.next = curr;
	    }
	    
	  

	//User function template for JAVA

	/* Node is defined as

	class Node
	{
	    int data;
	    Node next;
	    Node(int d) {data = d; next = null; }
	}

	*/


	
	    //Function to check if the linked list has a loop.
	    public static boolean detectLoop(Node head){
	        Node slow_pointer = head, fast_pointer= head;
	        while(slow_pointer != null && fast_pointer != null && 
	        fast_pointer.next != null){
	            slow_pointer=slow_pointer.next;
	            fast_pointer=fast_pointer.next.next;
	            if (slow_pointer == fast_pointer) {
	                //Loop Detected
	             return true;
	            
	            }
	        }
	        //Loop Not Detected
	       return false;
	        
	    }

	
	    //Main Driver class 
	  public static void main (String[] args){
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        
	        while(t == 0)
	        {
	            int n = sc.nextInt();
	            
	            int num = sc.nextInt();
	            Node head = new Node(num);
	            Node tail = head;
	            
	            for(int i=0; i<n-1; i++)
	            {
	                num = sc.nextInt();
	                tail.next = new Node(num);
	                tail = tail.next;
	            }
	            
	            int pos = sc.nextInt();
	            makeLoop(head, tail, pos);
	            
	          
	            if(detectLoop(head) )
	                System.out.println("True");
	            else
	                System.out.println("False");
	        }
	        sc.close();
	    }
	


	

	
}
