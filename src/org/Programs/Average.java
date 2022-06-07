package org.Programs;

import java.util.Scanner;

public class Average {
	
/*Description: Using Scanner class get the below details
   studentId
   studentName
    Mark1
    Mark2
    Mark3
    Mark4
    Mark5
  :Find the total and average of marks*/
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student ID : ");
		int stdID = sc.nextInt();
		System.out.println("Your ID is : " +stdID);
		
		System.out.println("Enter the Mark 1 :");
		int Mark1 = sc.nextInt();
		System.out.println("your mark 1 is :" +Mark1);
		
		System.out.println("Enter the Mark 2");
		int Mark2 = sc.nextInt();
		System.out.println("your mark 2 is :" +Mark2);
		
		System.out.println("Enter the Mark 3");
		int Mark3 = sc.nextInt();
		System.out.println("your mark 3 is :" +Mark3);
		
		System.out.println("Enter the Mark 4");
		int Mark4 = sc.nextInt();
		System.out.println("your mark 1 is :" +Mark4);
		
		System.out.println("Enter the Mark 5");
		int Mark5 = sc.nextInt();
		System.out.println("your mark 1 is :" +Mark5);
		
		int storage, total = 5; 
				int avg;
		
		
		storage = Mark1+ Mark2 + Mark3 + Mark4 + Mark5;
		
		avg = storage / total;
		
		System.out.println("Your averagre Mark is : " +avg);
	}
}
