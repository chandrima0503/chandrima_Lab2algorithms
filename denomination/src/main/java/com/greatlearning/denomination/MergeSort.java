package com.greatlearning.denomination;

class MergeSort {

	//Method to sort the denominations array using mergesort
	public void sort_denomination(int[] denominations, int left, int right) {
		if(left < right) {
			int middle = (left+right)/2;
			sort_denomination(denominations, left, middle);
			sort_denomination(denominations, middle + 1, right);
			merge(denominations, left, middle, right);
		}
	}

	//Method that recursively implements mergesort
	public void merge(int arr[], int l, int m, int r)
	{
	        int n1 = m - l + 1;
	        int n2 = r - m;
	 
	        /* Create temp arrays */
	        int L[] = new int[n1];
	        int R[] = new int[n2];
	 
	        /*Copy data to temp arrays*/
	        for (int i = 0; i < n1; ++i)
	            L[i] = arr[l + i];
	        for (int j = 0; j < n2; ++j)
	            R[j] = arr[m + 1 + j];
	 
	        int i = 0, j = 0;
	 
	        int k = l;
	        while (i < n1 && j < n2) {
	            if (L[i] <= R[j]) {
	                arr[k] = L[i];
	                i++;
	            }
	            else {
	                arr[k] = R[j];
	                j++;
	            }
	            k++;
	        }
	 
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) {
	            arr[k] = L[i];
	            i++;
	            k++;
	        }
	 
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) {
	            arr[k] = R[j];
	            j++;
	            k++;
	        }
	    }
}