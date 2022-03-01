package com.phase1.assistedprograms;


public class BubbleSort {  
    static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int k = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                        	  
                                 k = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = k;  
                         }  
                          
                 }  
         }  
  
    }  
    public static void main(String args[]) {  
                int arr[] ={66,74,23,41,90,10};  
                 
                System.out.println("Before Sorting");  
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
                System.out.println();  
                  
                bubbleSort(arr);  
                 
                System.out.println("After Sorting");   
                for(int i=0; i < arr.length; i++){  
                        System.out.print(arr[i] + " ");  
                }  
   
        }  
}  