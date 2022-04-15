package com.personal.codeprep;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysVsArraysListMorePractice {

	public static void main(String args[]) {
		
		//Initializing a 2D array
		int[][] twoDimensionalArray = { {2,3,4}, {5,6,7}, {5,5,3},{ 7,6,5} };
		
		
		
		for(int i =0; i<4; i++) {
			for(int j= 0; j<3; j++) {
			System.out.println(twoDimensionalArray[i][j]);
		}
			
		}
		
		//Initializing an arrayList containing 2Dimensional Array.
		ArrayList<ArrayList<String>> aListcontainingListOfStringValues = new ArrayList<ArrayList<String>>();
	
		ArrayList<String> innerList1 = new ArrayList<>();
		innerList1.add("Application1");
		innerList1.add("Application2");
		innerList1.add("Application3");
		innerList1.add("Application4");
		innerList1.add("Application5");
		innerList1.add("Application6");
		aListcontainingListOfStringValues.add(innerList1);
		
		ArrayList<String> innerList2 = new ArrayList<>();
		innerList2.add("Application11");
		innerList2.add("Application22");
		innerList2.add("Application33");
		innerList2.add("Application44");
		innerList2.add("Application55");
		innerList2.add("Application66");
		aListcontainingListOfStringValues.add(innerList2);
		
		ArrayList<String> innerList3 = new ArrayList<>();
		innerList3.add("Application111");
		innerList3.add("Application222");
		innerList3.add("Application333");
		innerList3.add("Application444");
		innerList3.add("Application555");
		innerList3.add("Application666");
		aListcontainingListOfStringValues.add(innerList3);
		
		
		for(int i=0; i<aListcontainingListOfStringValues.size(); i++) {
			for(int j=0; j<aListcontainingListOfStringValues.get(i).size(); j++) {
				System.out.println(aListcontainingListOfStringValues.get(i).get(j) + "  ");
				
			}
			System.out.println(aListcontainingListOfStringValues);
		}
		
		//Java gives you the memory address of that array ,which is this memory address---> [[I@15db9742
		System.out.println(twoDimensionalArray);
	}
}
