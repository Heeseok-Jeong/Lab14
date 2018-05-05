package edu.handong.csee.java.lab14.prob2;

import java.util.InputMismatchException; //call a InputMismatchException class to use
import java.util.Scanner; //call a Scanner class to use

public class InException { //the class InException
	private int x, y; //declare instance variables x and y
	
	public void errorDet() { //this method gets two numbers and calculates x/y and notice about error
		try { //do a below contents
			Scanner keyboard = new Scanner(System.in); //instantiate Scanner class
			System.out.print("x : "); //print some message to get x value
			x = keyboard.nextInt(); //x value gets from user
			System.out.print("y : "); //print some message to get y value
			y = keyboard.nextInt(); //y value gets from user
			System.out.println(x / y); //print x/y value
			keyboard.close(); //close keyboard
		}
		catch(ArithmeticException e) { //if any error which is in ArithmeticException exists 
			System.out.println("java.lang.ArithmeticException : "  + e.getMessage()); //print about that error
		}
		catch(InputMismatchException e) {//if any error which is in InputMismatchException exists 
			System.out.println("java.util.InputMismatchException"); //print about that error
		} 
		catch(Exception e) { //if any error which is in Exception exists 
			System.out.println("Some othe exception has occurred : " + e.getMessage()); //print about that error
		}
	}
	
}