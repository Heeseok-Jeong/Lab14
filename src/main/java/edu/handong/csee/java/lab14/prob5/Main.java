package edu.handong.csee.java.lab14.prob5;

import java.util.Scanner;

public class Main {
	private static String str;
	
	public static void main(String[] args) {
		
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Input string : ");
			str = keyboard.nextLine();
			Main.myTest(str);
			keyboard.close();
		}
		catch(MyException mae) {
			System.out.println("Inside catch black : " + mae.toString());
		}
		
	}

	public static void myTest(String str) throws MyException{
		if(str.equals("null"))
			throw new MyException("String val is null");
		else
			System.out.println("String val is : " + str);
	}
	
}
