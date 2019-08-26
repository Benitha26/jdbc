package com.quinnox.jdbc;

import java.io.*;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Employee e=new Employee();
			e.name="Micheal Huissman";
			e.address="Castle Street,Bangalore";
			e.SSN=11122333;
			e.number=101;
			try{
				FileOutputStream fileout=new FileOutputStream("d:/abc/employee.ser");
				ObjectOutputStream out= new ObjectOutputStream(fileout);
				out.writeObject(e);
				out.close();
				System.out.println("Serializes data is saved in d:/abc/employee.ser");
			}
			catch(IOException i)
			{
				i.printStackTrace();
			}
	}

}
