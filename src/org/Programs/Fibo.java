package org.Programs;

import java.util.Scanner;

public class Fibo {

	// 0,1,1,2,3,5,8,13,21,34,55

	static int a = 0, b = 1, d = 0;

	public static void fibona(int value) {

		if (value > 0) {

			d = a + b; // a=1
			a = b; // b=1;
			b = d; //

			System.out.print(" " + d);

			fibona(value - 1);

		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the counter value : \n" );
		
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		System.out.print(a + " " + b);
		fibona(count -2);

	}

}
