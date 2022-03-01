package com.phase1.assistedprograms;


class Calculator {
	static int add(int a, int b)
	{
		return a+b;
	
	}
	static int add(int a, int b, int c) {
		return(a+b+c);
	}
}
public class Polymorphism {
	

	public static void main(String args[]) {
		System.out.println(Calculator.add(5,4));
		System.out.println(Calculator.add(10,2,4));
	}
}
	