package org.Programs;

import java.util.stream.IntStream;

public class UsingRecursive {
	
	public static void main(String[] args) {
		
//		PrintNum(7,70);

		// One Way
		
		IntStream.range(15, 50).forEach(e->System.out.println(e));
			
	}	
	
	// Print numbers 1 to 100 without using for loop 
	
		public static void PrintNum(int startnum, int endnum) {
			
			if(startnum<=endnum) {
				
				System.out.println(startnum);
				startnum++;
				PrintNum(startnum, endnum);
			}
			
			
		}
}
