package com.assignment.programs;


	public class MyThread implements Runnable{
		 
	    public static int myCount = 0;
	    public MyThread(){
	         
	    }
	    public void run() {
	        while(MyThread.myCount <= 10){
	            try{
	                System.out.println("Expl Thread: "+(++MyThread.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex) {
	                System.out.println("Exception in thread: "+iex.getMessage());
	            }
	        }
	    } 
	    public static void main(String a[]){
	        System.out.println("Starting Main Thread");
	        MyThread mrt = new MyThread();
	        Thread t = new Thread(mrt);
	        t.start();
	        while(MyThread.myCount <= 10){
	            try{
	                System.out.println("Main Thread: "+(++MyThread.myCount));
	                Thread.sleep(100);
	            } catch (InterruptedException iex){
	                System.out.println("Exception in main thread: "+iex.getMessage());
	            }
	        }
	        System.out.println("End of Main Thread");
	    }
	}


