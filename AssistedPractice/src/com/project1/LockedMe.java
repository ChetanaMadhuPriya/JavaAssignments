package com.project1;
import java.io.*;
import java.util.Scanner;
import java.io.IOException;
public class LockedMe
 {

	public static void main(String[] args)throws IOException, InterruptedException 
	{
		Scanner sc = new Scanner(System.in);
		int choice,Fchoice,OPchoice,  fc=0,j, count=0;
		String st;
		File mFolder =new File("D:\\Chetana\\JAVAMAIN");
		mFolder.mkdir();
		
		String location = "D:\\Chetana\\JAVAMAIN";
		
		System.out.println("Welcome to Virtual Key for Repositories in JAVA\n\n");
		System.out.println("Press Enter to continue...");
	    System.in.read();
	    System.out.print("\u000C");
        do {
        	choice=0;
	    System.out.println("MAIN MENU");
	    System.out.println("Select the Options Given Below:");
	    System.out.println("1. Retrieve All Files inside Main Folder");
	    System.out.println("2. Perform File Operations");
	    System.out.println("3. Exit\n");
	    choice= sc.nextInt();
	    switch(choice) {
	    case 1:
	    	File Fobj = new File("D:\\Chetana\\JAVAMAIN");
			File fArray[] = Fobj.listFiles();
	    	for(int i=0;i<fArray.length;i++) {
	    		if(fArray[i].isFile()) {
	    			System.out.println("File: "+fArray[i] +"\n\n");
	    		}
	    		else if(fArray[i].isDirectory()) {
	    			System.out.println("Folder: "+fArray[i]+"\n\n");
	    		}
	    	}
	    	break;
	    case 2:
	    	do {
	    		count=0;
	    		System.out.print("\u000C");
	    	System.out.println("FOLDER/FILE OPERATION SECTION");
	    	System.out.println("Select the Options Given Below:");
		    System.out.println("1. Add File/Folder");
		    System.out.println("2. Delete File/Folder");
		    System.out.println("3. Search File/Folder");
		    System.out.println("4. Goback Main Menu");
		    System.out.println("5. Exit\n");
		    Fchoice= sc.nextInt();
		    switch(Fchoice) {
		    case 1:
		    		
		    	System.out.println("Want to add File or Folder?");
		    	System.out.println("Press 1 for Folder, Press 2 for File:");
		    	OPchoice= sc.nextInt();
		    	switch(OPchoice) {
		    	case 1:
		    		System.out.println("Please Enter the Folder name");
		    		String str1 = sc.next();
		    		File addfolder = new File(location+"\\"+str1);
		    		if(addfolder.exists()) {
		    			System.out.println("Already exits !! Please Enter Again\n");
		    		}
		    		else {
		    			addfolder.mkdir();
		    			System.out.println("!!Your Folder is created!!!\n");
		    			
		    		}
		    		break;
		    	case 2:
		    		System.out.println("Please Enter the File name with extension");
		    		String str2 = sc.next();
		    		File addfile = new File(location+"\\"+str2);
		    		if(addfile.exists()) {
		    			System.out.println("Already exits !! Please Enter Again\n");
		    			}else {
		    				try {
		    					addfile.createNewFile();
		    					System.out.println("!!Your file is created!!!\n");
		    				}catch(IOException e) {
		    					e.printStackTrace();
		    				}
		    			}
		    			
		    	break;
		    	default:
		    		System.out.println("Please Enter Correct Value!!!!!\n");
		    	
		    	}
		    	
		    	break;
		    case 2:
		    	
		    		fc = 0;
		    	System.out.println("Want to Delete File or Folder?");
		    	System.out.println("Press 1 for Folder, Press 2 for File:");
		    	fc = sc.nextInt();
		    	switch(fc) {
		    		case 1:
		    		System.out.println("Please Enter the Folder name");
		    		st = sc.next();
		    		File delFolder = new File(location+"\\"+st);
		    		if(delFolder.exists()) {
		    			delFolder.delete();
		    			System.out.println("Folder Deleted\n");
		    		}
		    		else {
		    			System.out.println("!!Folder not Found!!!\n");
		    		}
		    		break;
		    		case 2: 
		    		System.out.println("Please Enter the File name with extension");
		    		st = sc.next();
		    		File delFile = new File(location+"\\"+st);
		    		if(delFile.exists()) {
		    			delFile.delete();
		    			System.out.println("File Deleted\n");
		    			}else {
		    				System.out.println("!!File not Found!!!\n");
		    			}
		    	break;
		    	default:
		    		System.out.println("Please Enter Correct Value!!!!!\n");
		    	}
		    	break;
		    	
		    case 3:
		    	System.out.println("Please Enter Name of File/Folder:");
		    	st = sc.next();
		    	File fsearch = new File("D:\\Chetana\\JAVAMAIN");
				File fsArray[] = fsearch.listFiles();
		    	for(int i=0;i<fsArray.length;i++) {
		    		if(fsArray[i].getName().startsWith(st)) {
		    			count++;
		    			if(fsArray[i].isFile()) {
			    			System.out.println("File: "+fsArray[i]+"\n\n");
			    		}
			    		else if(fsArray[i].isDirectory()) {
			    			System.out.println("Folder: "+fsArray[i]+"\n\n");
			    		}
		    		}    		
		    	}
		    	if(count==0)
		    		System.out.println("No Record found\n");
		    	break;
		    case 4: 
		    	break;
		    case 5:
		    	System.out.println("Thanks for using my application");
		    	System.exit(1);
		    	break;
		    
		    default:
	    		 System.out.println("Wrong input");
		    
		    }
		    
		    System.out.println("Press Enter to continue...");
		    System.in.read();
	    	}while(Fchoice!=4);
	    	break;
	    case 3:
	    	System.out.println("Thanks for using my application");
	    	System.exit(1);
	    	default:
	    		 System.out.println("Wrong input");
	    }
	    }while(choice!=3);
        sc.close();
        
	}

}