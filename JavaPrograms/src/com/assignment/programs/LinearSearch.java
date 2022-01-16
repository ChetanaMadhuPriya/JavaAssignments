package com.assignment.programs;

public class LinearSearch{    
public static int linearSearch(int[] arr, int key){    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String args[]){    
        int[] a1= {27,97,82,35,66,81,73,44};    
        int key = 35;    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}    
