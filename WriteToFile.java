package com.quinnox.jdbc;

import java.io.*;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			FileWriter writer = new FileWriter("d:/abc/names.txt",true); 
			BufferedWriter bwr = new BufferedWriter(writer);  

			bwr.write("James"); 
			//bwr.write("\n"); 
			bwr.newLine();
			bwr.write("Hobert"); 
			bwr.close(); 

			System.out.println("succesfully written to a file"); } 
			catch (IOException ioe) { 
			ioe.printStackTrace(); 

			}
	}

}
