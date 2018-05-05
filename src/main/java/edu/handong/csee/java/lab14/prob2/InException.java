package edu.handong.csee.java.lab14.prob2;

import java.util.InputMismatchException; //call a InputMismatchException class to use
import java.util.Scanner; //call a Scanner class to use

public class InException { //the class InException
	private int x, y; //declare instance variables x and y
	
	//public InException() {}; //
	
	public void errorDet() {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("x : ");
			x = keyboard.nextInt();
			System.out.print("y : ");
			y = keyboard.nextInt();
			System.out.println(x / y);
			keyboard.close();
		}
		catch(ArithmeticException e) {
			System.out.println("java.lang.ArithmeticException : "  + e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("java.util.InputMismatchException");
		}
		catch(Exception e) {
			System.out.println("Some othe exception has occurred : " + e.getMessage());
		}
	}
	
}