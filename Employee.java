package com.quinnox.jdbc;

import java.io.*;

public class Employee implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 String name;
	 String address;
 transient int SSN; //transient variable cannot be serialized.
	 int number;

public void mailcheck(){
		System.out.println("Mailing a check to"+name+" "+address);
	}

}
