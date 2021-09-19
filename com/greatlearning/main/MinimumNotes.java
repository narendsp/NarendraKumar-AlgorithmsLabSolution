package com.greatlearning.main;
import java.util.Scanner;

public class MinimumNotes {
	private static Scanner sc = new Scanner( System.in );
	
	public static void main( String[] args ) {
		// accept number of denominations (eg. 3) - size
		System.out.println( "Enter the size of currency denominations : " );
		int size = sc.nextInt();
		
		// allocate a notes array of that size
		int[] notes = new int[size];
		
		// accept the denominations (loop)
		System.out.println( "Enter the currency denominations value : " );
		for( int i = 0; i < size; i++ ) {
			notes[i] = sc.nextInt();
		}
		
		// accept the amount
		System.out.println( "Enter the amount you want to pay : " );
		int amount = sc.nextInt();
		
		
		MergeSortImplementation ms = new MergeSortImplementation();
		ms.sort( notes, 0, notes.length - 1 );
		
		// Your logic to print the number of notes of each variety
		
		int[] numNotes = new int[size];
		for (int i=0; i < notes.length; i++) {
			
	    numNotes[i] = (int) (amount / notes[i] );
	    amount = amount % notes[i]; //remaining amount   
		}
		
		if (amount !=0) {
			System.out.println( "Not possible to pay" );
			
		} else {
			System.out.println( "Your payment approach in order to give min no of notes will be" );
		for( int i = 0; i < size; i++ ) {
			
			System.out.println( notes[i] + " : " + numNotes[i] );
			
            
		}

	}
		
}
}
