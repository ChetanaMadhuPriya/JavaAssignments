package com.phase1.assistedprograms;

public class ArrayofString {  
    public static void main(String[] args) {  
        String[] strArray = { "Chetana", "Pravya", "Leena" };  
        boolean x = false;
        int in = 0; 
        String s = "Pravya"; 
        for (int i = 0; i < strArray.length; i++) {  
            if(s.equals(strArray[i])) {  
                in = i; x = true; break;  
            }  
        }  
        if(x)  
            System.out.println(s +" String is found at index "+in);  
        else  
            System.out.println(s +" String is not found in the array");  
    }  
}  