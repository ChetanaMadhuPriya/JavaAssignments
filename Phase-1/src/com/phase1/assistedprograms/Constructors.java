package com.phase1.assistedprograms;


public class Constructors 
{ 
//Declaration of Instance variables. 
    String name; 
    int age; 
    String address; 

    Constructors() 
    { 
      name = "pravya"; 
      age = 22; 
      address = "Gandhi Nagar"; 

    System.out.println(name+ " " +age+ " " +address); 
    }
    public static void main(String[] args) 
    { 

      Constructors p = new Constructors();  
    } 
}