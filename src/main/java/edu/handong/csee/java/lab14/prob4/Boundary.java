package edu.handong.csee.java.lab14.prob4;

public class Boundary { //the class Boundary
	private int[] arr = new int[5]; //declare instance variable arr, int type an array size 5
	private int count = 0; //initialize instance variable count
	
	public void recieve(int num) { //this method set and print array arr value 
		arr[count] = num; //arr[count] value is num value
		System.out.printf("arr[%d] <- %d\n", count++, num); //print about arr[count] value and count plus one
	}
}
