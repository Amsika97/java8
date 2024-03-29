package org.java.eighth.feature;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties_File_Demo {
	
	

	public static void main(String[] args) throws IOException {
		
		String filepath = "src/Configuration.properties";
		String Db;
		String user;
		String password;
		String Table;
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		
		FileInputStream file = new FileInputStream(filepath);
		
		prop.load(file);
		
		Db = prop.getProperty("Database");
		
		System.out.println("Database name : "+ Db);
		
		user = prop.getProperty("Username");
		
		System.out.println("Database name : "+ user);
		
		password = prop.getProperty("password");
		
		System.out.println("Database name : "+ password);
		
		Table = prop.getProperty("Table");
		
		System.out.println("Database name : "+ Table);
		

	}

}
