package com.personal.codeprep;

import java.util.Random;

public class WorkableInsertionSortAlgorithm {

	public static void main(String args[]) {
	Random random = new Random();
	int[] numbers = new int[8];
	
	for(int i = 0; i < numbers.length; i++) {
		numbers[i]= random.nextInt(100);
	}
	
	
	System.out.println("Before:");
	printArray(numbers);
	insertionSort(numbers);
	
	
	System.out.println("\n After:");
	printArray(numbers);
	
  }


	private static void insertionSort(int[] inputArray) {
		
	//Loop 1 taking care of keep i incrementing to next position and j to be i-1
		for(int i =1 ; i < inputArray.length; i++) {
			int currentValue = inputArray[i];
			int j = i - 1;
			
			//Loop 2 taking care of Greater number shifting to right and keep \
			//decrementing to left of array until currVal finds its true position to be inserted.
			while(j >=0 && inputArray[j] >=currentValue) {
				inputArray[j+1] = inputArray[j];
				j--;
			}
			inputArray[j+1]= currentValue;
		}
	}
	
	
	private static void printArray(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
	
	
}
