package edu.handong.csee.java.lab14.prob4;

import java.util.Scanner; //call a Scanner class to use

public class Main { //the Main class

	public static void main(String[] args) { //the main method
		int num; //declare a local variable num
		boolean repeat = true; //initialize local variable repeat boolean type 
		Scanner keyboard = new Scanner(System.in); //instantiate Scanner class
		Boundary bound = new Boundary(); //instantiate Boundary class
		
		while(repeat) { //looping while repeat value is true
			try { //do a below contents
				System.out.println("Enter an Integer : "); //print some message to get num value
				num = keyboard.nextInt(); //num value gets from user
				bound.recieve(num); //call a method recieve with parameter
			}
			catch(ArrayIndexOutOfBoundsException e) { //if any error which is in ArrayIndexOutOfBoundsException exists 
				System.out.println("Invalid array index access!"); //notice about that error situation
				repeat = false; //change repeat value to false
			}
		}
		keyboard.close(); //close keyboard
	}

}
