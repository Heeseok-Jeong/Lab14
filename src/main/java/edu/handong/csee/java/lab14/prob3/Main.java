package edu.handong.csee.java.lab14.prob3;

import java.util.Scanner; //call a Scanner class to use

public class Main { //the Main class
	public static void main(String[] args) { //the main method
		PowerCalc myCalc = new PowerCalc(); //instantiate PowerCalc class
		Scanner keyboard = new Scanner(System.in); //instantiate Scanner class
		System.out.println("Input n and p : "); //print some message to get n and p value
		while(keyboard.hasNextInt()) { //repeat while next token exists  
			int n = keyboard.nextInt(); //initialize n value by getting from user
			int p = keyboard.nextInt(); //initialize p value by getting from user
			
			try { //do a below contents
				System.out.println(myCalc.power(n, p)); //call a power method to print n^p
			}
			catch(Exception e) { //if any error which is in Exception exists 
				System.out.println(e); //print about that error situation
			}
		}
		keyboard.close(); //close keyboard
	}
}
