package com.creatio.crm.language.basics;

import java.util.logging.Logger;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello World!");
		System.out.print("Hello");
		System.out.print(" World!");
		
		System.out.println();
		
		//print statement to print with specific format
		System.out.printf("My Name is %s and my age is %d.%n","Sandip",32);
		
		System.out.format("Pi Value is approx  %.2f", 3.14159);
		System.out.println();
		
		
		System.out.write(65);
		System.out.println(" "+"Test");
		
		System.err.println("|| Error while converting ASCI to Normal Charter | ");
		
		//print informational Message Along with TimeStamp
		Logger.getLogger("MyLogger").info("Error while converting ASCI to Normal Charter ");
	
	
	
	}

}
