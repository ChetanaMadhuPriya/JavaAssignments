package com.phase1.assistedprograms;

import java.util.Scanner;
public class ArithematicCalculator {
		 
	     public static void main(String []args){
	         int a,b,choice;
	         float result=0;
	       
	         Scanner sc=new Scanner(System.in); 
	          
	         System.out.println("Enter first number: ");
	         a=sc.nextInt();
	         System.out.println("Enter second number: ");
	         b=sc.nextInt();
	         System.out.println("1.Addition \n 2.Subtraction \n 3. Multiplication \n 4.Division \n 5. Remainder \n 6. Exit");        
	          
	         System.out.print("\nEnter your choice: ");
	         choice=sc.nextInt();
	          
	         switch(choice)
	         {
	             case 1:
	                 result=(a+b); break;
	             case 2:
	                 result=(a-b); break;
	             case 3:
	                 result=(a*b); break;
	             case 4:
	                 result=(float)((float)a/(float)b); break;
	             case 5:
	                 result=(a%b); break;
	             default:
	                 System.out.println("An Invalid Choice!!!\n");
	         }
	         if(choice>=1 && choice<=5)
	            System.out.println("Result is: " + result);
	          
	     }
	}
