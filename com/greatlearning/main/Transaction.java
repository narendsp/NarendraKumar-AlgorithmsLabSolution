package com.greatlearning.main;

import java.util.Scanner;

public class Transaction
{

	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
        // get the size of transactions(size)
        
		System.out.println("Enter the size of transaction array");
        int trSize = sc.nextInt();

        // creating an array of provided size
        int[] transactions = new int[trSize];
        
        // get the elements of the array (in a loop)
        System.out.println("Enter the values of array");
        for (int i = 0; i < transactions.length; i++) {
            transactions[i] = sc.nextInt();
        }
        // get the number of targets
        System.out.println("Enter the total no of targets that needs to be achieved");
        int numTargets = sc.nextInt();
        
        // get in target one-by-one (loop)
        for (int i = 0; i < numTargets; i++) {
            
        	// Get TargetValue
            System.out.println("Enter the value of target");
            int target = sc.nextInt();
           
            int sum =0;
            for ( int j=0; j < transactions.length; j++) {
            	sum = sum + transactions[j];
            	
            	if ( sum >= target) {
            	System.out.println("Target achieved after " + (j+1) + " transactions" );
            	break; // break out of the innermost for loop
            	}
            	
            	//we come to the last transactions, yet target is not achieved
            	if (j == transactions.length - 1) {
            		System.out.println( "Given target is not achieved");
            	}
            	
            }
            
            
	}

}
}
        