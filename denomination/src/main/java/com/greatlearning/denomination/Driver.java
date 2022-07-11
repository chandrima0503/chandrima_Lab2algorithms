package com.greatlearning.denomination;
import java.util.*;
class Driver {
	public static void main(String[] args) {
		//Initializing Scanner class variable
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size = sc.nextInt();
		int[] denominations = new int[size];
		for(int i=0;i<size; i++) {
			System.out.println("Enter the currency denominations value");
			denominations[i] = sc.nextInt();
		}
		System.out.println("Enter the amount you want to pay");
		int amount = sc.nextInt();
		
		NoteCount cd = new NoteCount();
		cd.count_denomination(size, denominations, amount);
		sc.close();
	}
}