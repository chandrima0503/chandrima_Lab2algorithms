package com.greatlearning.denomination;
import java.util.*;
class Driver {
	public static void main(String[] args) {
		//Initializing Scanner class variable
		Scanner sc = new Scanner(System.in);

		//Taking input for size of currency denomoinations
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();

		//Initialising array to store currency denomination
		int[] denominations = new int[size];
		for(int i=0;i<size; i++) {
			//Taking user input of denominations
			System.out.println("Enter the currency denominations value");
			denominations[i] = sc.nextInt();
		}

		//Taking user input of the amount to be paid
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		//Creating an object of NoteCount class
		NoteCount cd = new NoteCount();

		//calling count_denomination method of noteCount class
		cd.count_denomination(size, denominations, amount);
		sc.close();
	}
}