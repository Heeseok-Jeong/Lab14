package edu.handong.csee.java.lab14.prob1;

public class SpeedLimit { //the class speedLimit
	private int limit, speed; //declare instance variables 
	
	public SpeedLimit(int limit, int speed) { //constructor which has two int type parameters
		this.limit = limit; //instance variable limit gets a value from parameter
		this.speed = speed; //instance variable speed gets a value from parameter
	}
	
	public void warnSpeedLimit() { //this method checks whether speed is over than limit or not and warns that
		try { //do below contents
			if(speed > limit) //if speed is larger than limit
				throw new Exception ("Speed Limit " + limit + "km exceeded!\nYou are being fined."); //let user know speed is larger than limit	
			System.out.println("You are a law abiding citizen!"); //speed isn't larger than limit, print some message 
			}
		catch(Exception e) { //if above contents has any exception that is in Exception class
			System.out.println(e.getMessage()); //print proper message
		}
		System.out.println("Your current speed : " + speed + "km");	//print about the speed
	}

}
