package edu.handong.csee.java.lab14.prob6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		CustomID obj = new CustomID();
		String name, race;
		int age;
		boolean repeat = true;
		
		while(repeat) {
			try {
				if(obj.getStep() == 0) {
					System.out.print("Enter your name : ");
					name = keyboard.next();
					obj.setName(name);
				}
				else if(obj.getStep() == 1) {
					System.out.print("Enter your age : ");
					age = keyboard.nextInt();
					obj.setAge(age);
					}
				else if(obj.getStep() == 2) {
					System.out.print("Enter your race : ");
					race = keyboard.next();
					obj.setRace(race);
				}
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		keyboard.close();
	}
}