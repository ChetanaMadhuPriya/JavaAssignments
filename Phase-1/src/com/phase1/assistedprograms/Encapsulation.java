package com.phase1.assistedprograms;


public class Encapsulation {  
	private String name;    
	public String getName(){  
	return  this.name;  
	}    
	public void setName(String name){  
	this.name=name; 
	}  
	public static void main(String args[])
	{
		Encapsulation s= new Encapsulation();
		s.setName("Chetana");
		System.out.println(s.getName());
	}
}

