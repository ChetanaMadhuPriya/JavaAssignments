package com.assignment.programs;

public class TypeCasting {
	public static void main(String[] args)
	{
		
		//implicit conversion	
		System.out.println("Implicit Type Casting");
		
		int i=20;
		
	        		System.out.println("The value of i: "+i);
	        
		byte b=(byte) i;
		
					System.out.println("The value of b: "+b);
		
		short s=(short) i;
		
		            System.out.println("The value of s: "+s);
		long l=i;
	
		            System.out.println("The value of l: "+l);
		           
		float f=l;
		
	               	System.out.println("The value of f: "+f);
	               	
		double d=f;
		
		          	System.out.println("The value of d: "+d);
		          	
				
		System.out.println("\n");
		
		System.out.println("Explicit Type Casting");
		//explicit conversion
		
		double d1=20.23;
		
		       		System.out.println("The value of d1: "+d1);
		       		
		float f1=(float)d1;
		
		         	System.out.println("The value of f1: "+f1);
				
				
		
		
	}
}                                                                                                