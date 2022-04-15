package com.personal.codeprep;

public class ArraysOfTypeObjects {

	public static void main(String args[]) {
		
		Student[] studentArray = new Student[5];
		
		
		
		//allocating an array of size 5 meaning 5 objects of type Student.
		//initialize an array with 5 object type elements of type Student.
		studentArray[0] = new Student("Aaron", 111);
		studentArray[1]=  new Student("Bob",222);
		studentArray[2]=  new Student("Cameron",333);
		studentArray[3]=  new Student("Dorothy",444);
		studentArray[4]=  new Student("Edward",555);
		

		
		
		for (int i=0; i<studentArray.length;i++) {
			System.out.println("Element at index " +i+ " : " +studentArray[i].studentName+  " " +studentArray[i].rollNumber);
		}
		System.out.println();
		
	}
}
