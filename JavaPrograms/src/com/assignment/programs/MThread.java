package com.assignment.programs;

	public class MThread extends Thread
	{
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running");
	}
	 	public static void main( String args[] )
	 	{
	 		MThread mt = new  MThread();
	  		mt.start();
	 	}
	}

	


