package com.personal.codeprep;

public class ArraysOfTypeIntegers {
	
	
    
	public static void main(String args[]) {
		
		//allocating an array of size 5 integers to the memory.
		//initializing an array
		int[] array = new int[5];
		array[0]= 20;
		array[1]= 30;
		array[2]= 40;
		array[3]=50;
		array[4]= 60;
		
		// take a for-loop and iterate over each element to print the elements.
		for(int i=0; i<array.length;i++) {
			System.out.println("Element at Index "   + i + ": " +array[i]);
		}
		
			
		}
	}

