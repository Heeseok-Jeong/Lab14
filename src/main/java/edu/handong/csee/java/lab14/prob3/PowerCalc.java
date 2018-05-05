package edu.handong.csee.java.lab14.prob3;

public class PowerCalc { //the class PowerCalc
	public long power(int n, int p) throws Exception { //this method checks any error before return n^p
		if(n < 0 || p < 0) { //if n or p is smaller than 0
			throw new Exception("n or p should not be negative."); //notice about this error situation
		}
		if(n == 0 && p == 0) { //if n and p are 0
			throw new Exception("n and p should not be zero."); //notice about this error situation
		}
		return (long)Math.pow(n,  p); //or not, returns n^p
	}
}
