package com.personal.codeprep;


import java.util.Random;

public class MergeSortAlgorithm {

public static void main(String args[]){
    Random random = new Random();
    int[] numbers = new int[10];
    
    for(int i =0 ;i<numbers.length; i++){
        numbers[i] = random.nextInt(1000);
    }
    System.out.println("Before:");
    printArray(numbers);
    
    mergeSort(numbers);
    System.out.println("\n After:");
    
    printArray(numbers);
}

        public static void mergeSort(int[] inputArray) {
            int inputArrayLength = inputArray.length;

            //creating two arrays
            //post creating these two arrays, these two arrays are just only created but they are empty.
            //so we need to fill up these both arrays populating elements from our Original Input Array.
            int midIndex = inputArray.length/2;
            int[] leftHalf = new int[midIndex];
            int[] rightHalf = new int[inputArrayLength - midIndex];

            
            //copy the elements of Original InputArray into the leftHalf of the Original Array.
            for(int i=0; i < midIndex; i++) {
                leftHalf[i] = inputArray[i];
            }

            //filling rightHalf that we created from the rightHalf in which we copy elements from right half.
            //of Original InputArray.
            for ( int j=midIndex; j<inputArrayLength;j++) {
                rightHalf[j- midIndex] = inputArray[j];
            }


            //Now how to tell algorithm how are we merging these two halves of Array.
            //so call the mergeSort().

            mergeSort(leftHalf);
            mergeSort(rightHalf);
            
            
            //actually tell the algorithm that we are now calling the merge to perform the fully sorted-merged array
            merge(inputArray, leftHalf, rightHalf);

        }


/** created another merge function so you don't clutter up/mixed/confused up with upper mergeSort() function */
        private static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {

            int leftSize = leftHalf.length;
            int rightSize = rightHalf.length;

            //we need each iterator variable to help us walk through
            //one iterator variable to walk through left-half array and one iterator
            //variable to walk through rightHalf array and one iterator variable to
            //walk through finally sorted-merged array.


            int i=0 , j=0 , k=0;
            while(i <leftSize && j <rightSize) {
                //compare ith element of leftHalf with the jth element of rightHalf
                // we will find the lowest element of both halves and add that lowest
                //element to the sorted-merged array. Then increment i to look at the
                //the next element of the same half where we picked the lowest element
                //after comparison.

                if(leftHalf[i] <=rightHalf[j]) {
                    inputArray[k]=leftHalf[i];
                    i++;
                }
                else {
                    inputArray[k]=rightHalf[j];
                    j++;
                }
                k++;
            }

            //when we ran out of elements either left or right array
            //we will just look for remaining elements,perform cleanup,
            //perform loop over those remaining elements. This will be all done
            //outside of the while loop.
            while(i< leftSize) {
                inputArray[k]= leftHalf[i];
                //at this time when i is incremented and then no new next element
                //to compare for, then this loop will automatically by-pass it
                //also making sure k also needs to look for next element and so this will
                // also be bypassed within this loop.
                i++;
                k++;
            }

            while(j< rightSize) {
                inputArray[k]= rightHalf[i];
                //at this time when i is incremented and then no new next element
                //to compare for, then this loop will automatically by-pass it
                //also making sure k also needs to look for next element and so this will
                // also be bypassed within this loop.
                j++;
                k++;
            }
        }
        
        public static void printArray(int[] numbers){
            for(int i=0; i<numbers.length; i++){
            System.out.println(numbers[i]);
           }
       }



}


