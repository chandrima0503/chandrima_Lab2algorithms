package com.greatlearning.payMoney;

import java.util.*;
class Driver {
	public static void main(String[] args) {
		//Initializing Scanner class variable
		Scanner sc = new Scanner(System.in);

		//User input for the number of daily transactions
		System.out.println("Enter the size of transaction array i.e no. of days of transaction");
		int n = sc.nextInt();

		//Initialising an array to store all the daily transactions
		int[] transactions = new int[3];
		for(int i=0; i<n; i++ ) {

			//User input for transaction value 
			System.out.println("Enter the "+i+" value of array");
			transactions[i] = sc.nextInt();
		}
		
		//User input for target daily transaction to be achieved
		System.out.println("Enter the total no of targets that needs to be achieved");
		int tot_targets = sc.nextInt();

		//Initialising an object of TargetAchieved class
		TargetAchieved ta = new TargetAchieved();
		for(int i=0; i < tot_targets; i++) {

			//User input for number of target transactions to be achieved
			System.out.println("Enter the target amount in crores");
			int target = sc.nextInt();
			
			//Calling the function noOfDays of class TargetTransactions
			int noOfTransaction = ta.noOfDays(n, transactions, target);
			if(noOfTransaction != -1)
				System.out.println("Target achieved after "+ noOfTransaction+" transactions \n");
			else 
				System.out.println("Given target "+target+ " is not achieved \n ");
		}
		
		sc.close();
	}
}