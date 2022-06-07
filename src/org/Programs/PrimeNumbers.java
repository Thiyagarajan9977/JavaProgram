package org.Programs;

import java.util.Scanner;

public class PrimeNumbers {

	// A number is which is divisble by 1 or itself is called prime numbers

	public static void main(String[] args) {

		int div, i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		div = sc.nextInt();

		if (div == 1) {

			System.out.println("The smallest prime number is 2");
		}

		for (i = 2; i < div; i++) {
			if (div % i == 0) {
				System.out.println("Not prime");
				break;
			}
		}

		if (div == i) {
			System.out.println("prime");
		}
	}
}
