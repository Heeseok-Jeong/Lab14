package edu.handong.csee.java.lab14.prob5;

import java.util.Scanner; //call a Scanner class to use

public class Main { //the Main class
	private static String str; //declare a String type static variable str
	
	public static void main(String[] args) { //the main method 
		try { //do a below contents
			Scanner keyboard = new Scanner(System.in); //instantiate Scanner class
			System.out.println("Input string : "); //print some message to get str
			str = keyboard.nextLine(); //str value gets from user
			myTest(str); //call a method myTest to check str is "null"
			keyboard.close(); //close keyboard
		}
		catch(MyException mae) { //if any error which is in MyException which is subclass of Exception class exists
			System.out.println("Inside catch block : " + mae.toString()); //print about that error situation
		}
		
	}

	public static void myTest(String str) throws MyException{ //this static method checks str is "null" or not print str
		if(str.equals("null")) //if str is "null"
			throw new MyException("String val is null"); //notice that situation
		else
			System.out.println("String val is : " + str); //or not, prints about str
	}
	
}
