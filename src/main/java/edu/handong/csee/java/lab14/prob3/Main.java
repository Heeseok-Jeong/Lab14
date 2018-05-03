package edu.handong.csee.java.lab14.prob3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PowerCalc myCalc = new PowerCalc();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input n and p : ");
		while(keyboard.hasNextInt()) {
			int n = keyboard.nextInt();
			int p = keyboard.nextInt();
			
			try { 
				System.out.println(myCalc.power(n, p));
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
		keyboard.close();
	}
}
