package com.assignment.programs;

public class InnerClass {

		 private String msg="Hello World"; 
		 
		 class Inner{  
		  void hello(){System.out.println(msg+", This is Chetana");}  
		 }  


		public static void main(String[] args) {

			InnerClass obj=new InnerClass();
			InnerClass.Inner in=obj.new Inner();  
			in.hello();  
		}
}


