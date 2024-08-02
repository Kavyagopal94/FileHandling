package com;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo 
{
	public static void main(String[] args) { //throws IOException
//	{
//		File f1=new File("Demo1.txt");
//		try {
//			f1.createNewFile();
//			System.out.println("File Created...!!!");
//		} 
//		catch (IOException e) {
//			e.printStackTrace();
//		}
//		
////		Scanner sc=new Scanner(System.in);
//		
//		try {
//			FileWriter w1=new FileWriter("Demo1.txt");
////			System.out.println("Enter the info...!!!");
////			String msg=sc.nextLine();
////			f1.write(msg);
//			w1.write("Hi\nhello\nBye");
//			w1.close();
//			System.out.println("Data Inserted...!!!");
//		}
//		catch (IOException e) {
//			
//			e.printStackTrace();
//		}
//		
//		try {
//			FileReader r1=new FileReader("Demo1.txt");
//			BufferedReader b1=new BufferedReader(r1);
//			System.out.println("====Data Inserted to file====");
//			String s=b1.readLine();
//			while(s!=null) {
//				System.out.println(s);
//				s=b1.readLine();
//			}
//		} 
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
	
	    File f1=new File("Demo1.txt");
	    f1.delete();
	    System.out.println("Deleted...!!!");
		
	}

}
