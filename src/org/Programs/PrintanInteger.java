package org.Programs;

import java.util.Scanner;

public class PrintanInteger {
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		
		int input = reader.nextInt();
		
		System.out.println("The Entered number is : " +input);		
	}
}
