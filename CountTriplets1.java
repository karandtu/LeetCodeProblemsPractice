package com.personal.codeprep;

public class CountTriplets1 {

        public static boolean linearSearch(int[] arr, int n, int key){
            
           
            for(int i=0; i<n ;i++){
                
                //check if a[i]==key. To find key , make comparisions with each element until n comparisions
                if(arr[i]==key)
                    return true;
                }
                return false;
            }
        
        
        public static void main(String args[]){
            
            int[] a = {1,5,8,9,34,17,7};
            int n = a.length;
            int k = 9;
            
            if(linearSearch(a , n, k)){
                System.out.println("Key element is present in the array");
        }
        else{
             System.out.println("Key element is not present in the array");
        }
        
    }
}


/**  Sum all the cases (where key is present in array+not present in array)   
 *   Make a sum and then divide the sum by n+1
 *   sum of n cases is sum of n positive integers = 28/8 = theta(35/10n) = theta(n)  //dropping constants
 *  Time complexity on an average case is theta(n).
 * */

