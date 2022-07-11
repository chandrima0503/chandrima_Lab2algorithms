package com.greatlearning.denomination;

class NoteCount {

	//method that counts the least number of denominations required to pay the amount.
	public void count_denomination(int n, int[] denominations, int amount) {
		int left = 0;
		int right = n-1;
		
		MergeSort mg = new MergeSort();
	    mg.sort_denomination(denominations,left, right);
	    
	    int[] noteCounter = new int[n];
	    for (int i = n-1; i >=0 ; i--) {
            if (amount >= denominations[i]) {
                noteCounter[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }
	    for(int i=n-1;i>=0;i--) {
	    	if (noteCounter[i] != 0) {
                System.out.println(denominations[i] + " : "
                    + noteCounter[i]);
            }
	   
	    }
	}
}