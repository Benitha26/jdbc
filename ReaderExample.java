package com.quinnox.jdbc;
import java.io.*;
public class ReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Reader r=new FileReader("d:/abc/test.txt");
			int data=r.read();
			while(data != -1){
				System.out.print((char)data);
				data=r.read();
			}
			r.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
