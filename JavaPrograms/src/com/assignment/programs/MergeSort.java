package com.assignment.programs;

public class MergeSort {

	void merge(int a[], int begin, int mid, int end)    
	{    
	    int i, j, k;  
	    int n1 = mid - begin + 1;    
	    int n2 = end - mid;    
	      
	        int LeftArray[] = new int[n1];  
	        int RightArray[] = new int[n2];  
	      
	        for (i = 0; i < n1; i++)    
	    LeftArray[i] = a[begin + i];    
	    for (j = 0; j < n2; j++)    
	    RightArray[j] = a[mid + 1 + j];    
	      
	    i = 0; 
	    j = 0;  
	    k = begin;   
	      
	    while (i < n1 && j < n2)    
	    {    
	        if(LeftArray[i] <= RightArray[j])    
	        {    
	            a[k] = LeftArray[i];    
	            i++;    
	        }    
	        else    
	        {    
	            a[k] = RightArray[j];    
	            j++;    
	        }    
	        k++;    
	    }    
	    while (i<n1)    
	    {    
	        a[k] = LeftArray[i];    
	        i++;    
	        k++;    
	    }    
	      
	    while (j<n2)    
	    {    
	        a[k] = RightArray[j];    
	        j++;    
	        k++;    
	    }    
	}    
	  
	void mergeSort(int a[], int begin, int end)  
	{  
	    if (begin < end)   
	    {  
	        int mid = (begin + end) / 2;  
	        mergeSort(a, begin, mid);  
	        mergeSort(a, mid + 1, end);  
	        merge(a, begin, mid, end);  
	    }  
	}  
	    
	void printArray(int a[], int n)  
	{  
	    int i;  
	    for (i = 0; i < n; i++)  
	        System.out.print(a[i] + " ");  
	}  
	  
	public static void main(String args[])  
	{  
	    int a[] = { 10,20,45,76,45,37,909,87};  
	    int n = a.length;  
	    MergeSort m1 = new MergeSort();  
	    System.out.println("\nBefore sorting array elements are : ");  
	    m1.printArray(a, n);  
	    m1.mergeSort(a, 0, n - 1);  
	    System.out.println("\nAfter sorting array elements are : ");  
	    m1.printArray(a, n);  
	    System.out.println("");  
	}  
	  
	  }  
