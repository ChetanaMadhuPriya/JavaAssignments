package com.assignment.programs;

public class BinarySearch {
	    
	    int binarySearch(int arr[], int a, int r, int x)
	    {
	        if (r >= a) {
	            int mid = a + (r - a) / 2;

	           
	            if (arr[mid] == x)
	                return mid;

	           
	            if (arr[mid] > x)
	                return binarySearch(arr, a, mid - 1, x);

	            
	            return binarySearch(arr, mid + 1, r, x);
	        }

	        
	        return -1;
	    }

	   
	    public static void main(String args[])
	    {
	        BinarySearch ob = new BinarySearch();
	        int arr[] = { 10,20,30,40,50};
	        int n = arr.length;
	        int x = 40;
	        int result = ob.binarySearch(arr,0, n-1, x);
	        if (result == -1)
	            System.out.println("Element not present");
	        else
	            System.out.println("Element found at index "
	                               + result);
	    }
	}
	

