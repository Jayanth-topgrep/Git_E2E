package demo;

import java.util.Scanner;

public class JavaBasicAssignment {

	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter value of X");
	    int X = myObj.nextInt();
		System.out.println("Enter value of Y");
		int Y = myObj.nextInt();

		System.out.println(String.format("Addition value is %s", X+Y));

		int leftShift = X << 1;
		System.out.println(String.format("Using left shift operator %s", leftShift));
		System.out.println(String.format("Subtract left shift with Y %s", leftShift-Y));

		int complement = ~Y; 
		System.out.println(String.format("2’s complement of Y is %s", complement));
		System.out.println(String.format("Multiply complement of Y with X %s", complement*X));

		double castedx = X;
		System.out.println(String.format("Division %s", castedx/Y));
		
		int larger=(X>Y)?X:Y;
		System.out.println(String.format("Larger is %s", larger));
		
		int smaller=(X<Y)?X:Y;
		System.out.println(String.format("Smaller is %s", smaller));

		System.out.println(String.format("Modulo of larger to smaller is %s", larger%smaller));
		
		System.out.println("Prime factors are as follows of Y");
		for(int i = 2; i< Y; i++) {
			while(Y%i == 0) {
			   System.out.print(i+" ");
			   Y = Y/i;
			}
		 }
		 if(Y >2) {
			System.out.print(Y);
		 }

	}

}
