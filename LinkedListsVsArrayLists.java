package com.personal.codeprep;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListsVsArrayLists {

	
	public static void main(String args[]) {
	
	LinkedList<String> linkedListNames = new LinkedList<>();
	linkedListNames.add("John");
	linkedListNames.add("Cameron");
	linkedListNames.add("McLaren");
	linkedListNames.add("Dorothy");
	linkedListNames.add("Carpenter");
	linkedListNames.add("Cody");
	linkedListNames.add(2, "Ammie");
	
	ArrayList<String> arrayListNames = new ArrayList<>();
	arrayListNames.add("John");
	arrayListNames.add("Cameron");
	arrayListNames.add("McLaren");
	arrayListNames.add("Dorothy");
	arrayListNames.add("Carpenter");
	arrayListNames.add("Cody");
	
	//Random Access is slower behind-the-scenes
	//Need to get from the beginning of index to get that particular element.
	//System.out.println(linkedListNames);
	
	//Random access is faster behind-the-scenes
	//Java directly grabs what you need from that index and gives you output.
	System.out.println(arrayListNames);
	//Dorothy---shifts--->Carpenter---shifts-->Code---Shifts to one more right place.
	//Then Meghan takes place for where Dorothy was earlier.
	//Totally slow process.
	arrayListNames.remove(2);
	System.out.println(arrayListNames);
	}
}
