package edu.handong.csee.java.lab14.prob6;

import java.util.Scanner; //call a Scanner class to use

public class Main { //the Main class

	public static void main(String[] args) { //the main method
		Scanner keyboard = new Scanner(System.in); //instantiate Scanner class
		CustomID obj = new CustomID(); //instantiate CustomID class
		String name, race; //declare String type instance variable name and race
		int age; //declare instance variable age
		boolean repeat = true; //initialize boolean type instance variable repeat with true
		
		while(repeat) { //looping while repeat value is true
			try { //do a below contents
				if(obj.getStep() == 0) { //if step value is 0
					System.out.print("Enter your name : "); //print some message to get name
					name = keyboard.next(); //name value gets from user
					obj.setName(name); //call a method setName with name
				}
				else if(obj.getStep() == 1) { //or if step value is 1
					System.out.print("Enter your age : "); //print some message to get age
					age = keyboard.nextInt(); //age value gets from user
					obj.setAge(age); //call a method setAge with age
					}
				else if(obj.getStep() == 2) { //or if step value is 2
					System.out.print("Enter your race : "); //print some message to get race
					race = keyboard.next(); //race value gets from user
					obj.setRace(race); //call a method setRace with race
				}
			}
			catch(Exception e) { //if any error which is in Exception exists
				System.out.println(e); //print about that situation
			}
		}
		keyboard.close();
	}
}