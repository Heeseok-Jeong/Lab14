package edu.handong.csee.java.lab14.prob2;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.google.common.util.concurrent.ExecutionError;

public class In_exception {
	private int x, y;
	
	public In_exception() {};
	
	public void error_det() {
		try {
			Scanner keyboard = new Scanner(System.in);
			System.out.print("x : ");
			x = keyboard.nextInt();
			System.out.print("y : ");
			y = keyboard.nextInt();
			System.out.println(x / y);
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
