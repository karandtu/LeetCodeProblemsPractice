package com.personal.codeprep;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysvsarrayLists {

	public static void main(String args[]) {
		/**Once array created with such size, you cannot grow or shrink
		String[] friendsArray = new String[5];  */

		//  //adding the list of elements in an array  Only disadvantage is we are making it immutable.
		String[] friendsArrayInitializetion = {"Aaron","Bob","Cameron","Dorothy","Edwards","Farukh"};

		/**size grows or shrinks automatically. It is pretty handy and flexible that way
		ArrayList<String> friendsArrayStringList = new ArrayList<>();  */

		//adding the list of elements NOT in an array but in an ARRAYLIST. Only Benefit is we can make it mutable.
		ArrayList<String> friendsArrayStringListInitialization = new ArrayList<>(Arrays.asList(
				"Aaron","Bob","Cameron","Dorothy","Edwards","Farukh"));

		/**size grows or shrinks automatically. It is pretty handy and flexible that way
		ArrayList<Integer> friendsArrayIntegerList = new ArrayList<>();  */

		//adding the list of elements NOT in an array but in an ARRAYLIST. Only Benefit is we can make it mutable.
		ArrayList<Integer> friendsArrayIntegerListInitialization1 = new ArrayList<>(Arrays.asList(
				1,2,3,4,5,6,7,8));

		for(int i=0;i< friendsArrayInitializetion.length; i++) {
			System.out.println(friendsArrayInitializetion[i]);
		}
		System.out.println("\n");
		System.out.println(friendsArrayInitializetion[3]);
		System.out.println("\n");
		System.out.println(friendsArrayStringListInitialization.get(4));
		System.out.println("\n");
		System.out.println(friendsArrayIntegerListInitialization1.get(4));
		System.out.println("\n");
		//comes just a variable length which is int which is just variable value.
		System.out.println(friendsArrayInitializetion.length);
		//this is not variable. This is a method call .
		System.out.println(friendsArrayStringListInitialization.size());
		System.out.println("\n");

		//Adding an element to an ArrayList because its size is immutable/changeable. Pretty flexible.
		System.out.println(friendsArrayStringListInitialization.add("Mitch"));
		friendsArrayStringListInitialization.add("Mitch");
		System.out.println(friendsArrayStringListInitialization.get(6));
		System.out.println("\n");

		//Now setting an element in Arrays Vs ArrayList
		friendsArrayInitializetion[1] ="Benedict";

		for(int i=0;i< friendsArrayInitializetion.length; i++) {
			System.out.println(friendsArrayInitializetion[i]);
		}

		for(int i=0;i< friendsArrayIntegerListInitialization1.size(); i++) {
			System.out.println(friendsArrayIntegerListInitialization1.get(i));
		}
	}

	
	
}
