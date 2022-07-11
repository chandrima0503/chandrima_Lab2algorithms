package com.greatlearning.payMoney;

public class TargetAchieved {
	
	public int noOfDays(int n, int[] transactions, int target) {
		int sum = 0;
		int i=0;
		while(i<n) {
			sum+=transactions[i];
			if(sum>=target) {
				return i+1;
			}
			i++;
		}
		return -1;	
		
	}
}

	