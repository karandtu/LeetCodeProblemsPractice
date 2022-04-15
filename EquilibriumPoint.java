package com.personal.codeprep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 
 * 
 * @author sidhha5
 * 
 * Given an array A of n positive numbers. The task is to find the first Equilibium Point in the array. 
Equilibrium Point in an array is a position such that the sum of elements before it is equal to the sum of elements after it.

Example 1:

Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation: For second test case 
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2). 
 

Example 2:

Input:
n = 1
A[] = {1}
Output: 1
Explanation:
Since its the only element hence
its the only equilibrium point.
 *
 */
public class EquilibriumPoint {

	public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            
            //taking input n
            int n = Integer.parseInt(br.readLine().trim());
            long arr[] = new long[n];
            String inputLine[] = br.readLine().trim().split(" ");
            
            //adding elements to the array
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(inputLine[i]);
            }

            Solution ob = new Solution();
            
            //calling equilibriumPoint() function
            System.out.println(ob.equilibriumPoint(arr, n));
        }
    }
}// } Driver Code Ends


class Solution {

    
    // a: input array
    // n: size of array
    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        int position = -1, leftSum =0 , rightSum =0;
        
        for( int i=0; i < n ; i++){
            //calculate rightSum starting from 0+arr[i]
            //and then add them like fabonicco series type.
            //0=1=1 and then 1+3=4 4+5=9 9+2=11 11+2=13
            rightSum += arr[i];
        }
        
        for(int i = 0; i < n; i++){
            //we update the rightSum as rightSum -1. Hence rightSum updated
            //comes as 13- arr[0] = 13-1 =12.
            rightSum -= arr[i];
            //compare leftSum with rightSum and if they are equal,
            //determine the equilibrium and break the loop and return that
            //position. else get out of loop and update leftSum.
            //since leftSum starts from 0 so its zero.
            if(leftSum==rightSum){
                position = i + 1;
                break;
            }
            leftSum += arr[i];
        }
        return position;
    }
}
