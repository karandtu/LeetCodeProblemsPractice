package com.personal.codeprep;

import java.util.Random;

public class QuickSortAlgorithm {

	public static void main(String args[]) {
	    
	    Random random = new Random();
	    int[] numbers = new int[10];
	    
	    
	    for(int i=0; i< numbers.length; i++){
	        numbers[i]= random.nextInt(50);
	    }
	    System.out.println("Before:");
	    printArray(numbers);
	    
	    //just want to sort the simple normal array. 
	    quickSort(numbers);
	    System.out.println(":\n After");
	    printArray(numbers);
	}   
	    
	    private static void printArray(int[] numbers) {
	    	for(int i=0;i< numbers.length; i++) {
	    		System.out.println(numbers[i]);
	    	}
	    }
	    
	    //method overloading
	    //Here this method intakes the other method functionality having lowIndex and highIndex that starts with line 39.
	    private static void quickSort(int[] array) {
	        //our lowInde is zero. HighIndex will be length of Array-1.
	    	quickSort(array, 0, array.length-1);
	    }
	    
	    private static void quickSort(int[] array, int lowIndex, int highIndex){
	        if(lowIndex >= highIndex) {
	        	return;
	        }
	    	int pivot = partition(array, lowIndex, highIndex);
	    	//There-after perform recursive quick-sort on left & right sub-array.
	    	
	    	quickSort(array, lowIndex, pivot -1);
	    	quickSort(array,pivot+1, highIndex);
	    	}

		private static int partition(int[] array, int lowIndex, int highIndex) {
	    	Random rand = new Random();
	    	//Choosing the pivot element in a Random manner. So use Random class for it to serve you as pivotRandomElement.
			int pivotRandomElement = rand.nextInt(highIndex - lowIndex) + lowIndex;
			int midELement = array[pivotRandomElement];
	    	int leftIndexPointer = lowIndex;
	    	int rightIndexPointer = highIndex;
	    	
	    	//Outer loop
	    	while(leftIndexPointer < rightIndexPointer) {
	    		//inner loop for leftIndexPointer
	    		while(array[leftIndexPointer] <= midELement && leftIndexPointer < rightIndexPointer) {
	    			leftIndexPointer++;
	    		}
	    		//inner loop for rightIndexPointer
	    		while(array[rightIndexPointer] >= midELement && leftIndexPointer < rightIndexPointer) {
	    			rightIndexPointer--;
	    		}
	    		//when leftPointer > pivot and rightPointer < pivot, just swap them.
	    		swap(array,leftIndexPointer, rightIndexPointer);
	    		
	    		}
	    	//break the outer-loop when leftIndexPointer == rightIndexPointer
	    	//remove and replace pivot as value 7 from highIndex into its centralPosition
	    	swap(array,leftIndexPointer, midELement);
	    	//Now pivot element is placed in its correct position
	    	//so now look for elements lesser than pivot to be at left
	    	//and elements higher than pivot to be at right.
			return midELement;
		}

		private static void swap(int[] array, int index1, int index2) {
			int temp = array[index1];
			array[index1] = array[index2];
			array[index2] = temp;
			
		}
	}

