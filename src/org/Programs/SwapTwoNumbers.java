package org.Programs;

import java.util.Scanner;

public class SwapTwoNumbers {
	
	public static void main(String[] args) {
		
		// 15 20 
		// b a
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		int a = sc.nextInt();
		System.out.println("Enter the 2nd value:");
		int b = sc.nextInt();
		
		a=a+b; // a=3 + b=1 = a=4
		b=a-b; // a=3 - b=1 = b=2
		a=a-b; //a=3 - b=1 = a=2
		
	
		System.out.println("The swapped 1st value : " +a );
		System.out.println("The swapped 2nd value : " +b );		
		
	}

}
