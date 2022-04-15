package com.personal.codeprep;

public class InsertionSortAlgorithm {

	/** we will first make two halves of the array list.
	 * Left Half will be sorted Sublist and rightHalf is unsorted sublist.
	 * We will check if element from unsorted sublist is less than the element 
	 * in the sorted sublist, then store that lesser value in un-sorted list in temp
	 * Now check each element in sorted sublist with the one kept in temp.
	 * Find the appropriate place where you can just insert temp lesser value in the fit
	 * position.
	 * The starting element in sorted sub-list is always sorted.
	 * 
	 * 
	 * 
	 */
	public static void insertionSort(int[] A, int n) {
	int i = 1, j=0;
	for (i = 1 ; i< n; i++) {
		int temp = A[i];
		j = i - 1;
		
		while( j >=0 && A[j]> temp) {
			A[j+1] = A[j];
			j--;
		}
		A[j+1] = temp;
		
	}
	
  }
	
	public static void main(String args[]) {
		int[] arr = {4,5,10,1,6,2};
		int n = arr.length;
		System.out.println("The array has unsorted and sorted halves of the array");
		System.out.println("Insertion sort algorithm is applied on the full array now");
		insertionSort(arr, n);
		System.out.println("Insertion Sort Algorithm is finished.");
	}
}
