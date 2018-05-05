package edu.handong.csee.java.lab14.prob1;

import java.util.Random; //import a Random class to use
import java.util.Scanner; //import a Scanner class to use 

public class Main { //the Main class

	public static void main(String[] args) { //main method
		int limit, speed; //declare local variables limit and speed
		Scanner keyboard = new Scanner(System.in); //instantiate Scanner class to get value from user
		Random rand = new Random(); //instantiate Random class to make random number
		
		System.out.print("Set the speed limit, officer : "); //print about set the speed
		limit = keyboard.nextInt(); //limit value gets from user
		speed = rand.nextInt(101); //speed value is random number in 0 to 100
		
		SpeedLimit lim = new SpeedLimit(limit, speed); //instantiate SpeedLimit with two parameters limit, speed
		lim.warnSpeedLimit(); //call a method warnSpeedLimit
		
		keyboard.close(); //close a keyboard
	}

}
