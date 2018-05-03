package edu.handong.csee.java.lab14.prob4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int num;
		Scanner keyboard = new Scanner(System.in);
		Boundary bound = new Boundary();
		boolean repeat = true;
		
		while(repeat) {
			try {
				System.out.println("Enter an Integer : ");
				num = keyboard.nextInt();
				bound.recieve(num);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Invalid array index access!");
				repeat = false;
			}
		}
		keyboard.close();
	}

}
