package org.Programs;

import java.util.stream.IntStream;

public class PrintNumberWithoutLooping {

	// Recrusive Function
	
	public static void printnum(int num) {
		if (num <= 100) {
			System.out.println(num);
			num = num + 1;
			printnum(num);
		}
	}

	public static void printnumstartandend(int start, int end) {

		if (start <= end) {
			System.out.println(start);
			start = start + 1;
			printnumstartandend(start, end);
		}
	}

	public static void main(String[] args) {

		//printnum(1);		
		//printnumstartandend(1, 100);
		
		// Using Java Streams
		
		IntStream.range(1, 101).forEach(e->System.out.println(e));
		

	}
}
