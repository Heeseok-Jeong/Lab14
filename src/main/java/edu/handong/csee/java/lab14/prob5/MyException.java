package edu.handong.csee.java.lab14.prob5;

public class MyException extends Exception{
	private String mStr;
	
	public MyException( ) {
		super();
	}
	
	public MyException(String str) {
		super(str);
		mStr = str;
	}
	
	public MyException(Throwable cause) {
		super(cause);
	}
	
	public String toString() {
		return mStr;
	}
}
