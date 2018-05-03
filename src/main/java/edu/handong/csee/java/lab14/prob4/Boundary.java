package edu.handong.csee.java.lab14.prob4;

public class Boundary {
	private int[] arr = new int[5];
	private int count = 0;
	
	public void recieve(int num) throws ArrayIndexOutOfBoundsException {
		arr[count++] = num;
		System.out.printf("arr[%d] <- %d\n", count-1, num);
	}
}
