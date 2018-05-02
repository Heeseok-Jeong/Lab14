package edu.handong.csee.java.lab14.prob1;

public class SpeedLimit {
	private int limit, speed;
	
	public SpeedLimit(int limit, int speed) {
		this.limit = limit;
		this.speed = speed;
	}
	
	public void warnSpeedLimit() {
		try {
			if(speed > limit) 
				throw new Exception ("Speed Limit " + limit + "km exceeded!\nYou are being fined.");	
			System.out.println("You are a law abiding citizen!");
			}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Your current speed : " + speed + "km");	
	}

}
