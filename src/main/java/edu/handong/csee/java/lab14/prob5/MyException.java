package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception{ //the class MyException which is subclass of Exception class
	private String mStr; //declare instance variable mStr
	
	public MyException(String str) { //constructor which has a String type parameter
		super(str); //also give this parameter to Exception constructor
		mStr = str; //mStr value is parameter value
	}
	
	public MyException(Throwable cause) { //constructor which has a Throwable type parameter
		super(cause); //also give this parameter to Exception constructor
	}
	
	public String toString() { //this method returns mStr
		return mStr; //returns mStr
	}
}
