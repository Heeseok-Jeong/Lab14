package edu.handong.csee.java.lab14.prob1;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int limit, speed;
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Set the speed limit, officer : ");
		limit = keyboard.nextInt();
		speed = rand.nextInt(101);
		
		SpeedLimit lim = new SpeedLimit(limit, speed);
		lim.warnSpeedLimit();
		
		keyboard.close();
	}

}
