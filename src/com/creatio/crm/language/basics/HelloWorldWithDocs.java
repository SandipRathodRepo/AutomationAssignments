package com.creatio.crm.language.basics;

public class HelloWorldWithDocs {
	/**
	 * This is a main method added by Java. Always JVM execution will begin from
	 * here This is depending on {@link #master}
	 * 
	 * 
	 * @param Array of Strings in the form of String[] or String .... (input)
	 * @return It wont return Any Data. It Simply execute the code and stop the
	 *         execution
	 * @author sandip (Sandip.rathod5592@gmail.com)
	 * @version 1.0 (Modified new Feature)
	 * @throws there may be a chance of getting Null Pointer Exception
	 * @deprecated (No More Useful) New Version is Available, this function is about
	 *             to remove
	 */
	public static void main(String[] args) {

		System.out.println("Hello World!");
		byte b = 10;
		System.out.println(b);
		
		char grade = 65;
		System.out.println(grade);
	}

	/**
	 * @deprecated
	 * @param args
	 */
	public static void master(String args) {

		System.out.println("Hello World!");

	}

}
