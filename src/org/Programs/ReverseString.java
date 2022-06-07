package org.Programs;

public class ReverseString {

	public static void main(String[] args) {

		String str = "I Love Java Coding";

		int start = str.length();

		for (int i = start - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));
		}
		// using char array

		char a[] = str.toCharArray();
		int length = a.length;

		for (int i = length - 1; i >= 0; i--) {

			System.out.print(a[i]);
		}

		if (System.out.printf("Hello World") == null) {

		}

	}

}
