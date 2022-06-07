package org.Programs;

public class ForLoop {

	public static void main(String[] args) {
		
	
			System.out.println("********For Loop*******");
		
			for (int i = 0; i < 10; i++) { // Initialization, Conditional, Incremental			
			System.out.println(i);
			}
			
			System.out.println("*********While Loop ********");
			
			int j=1; // Initialization	
			while (j<=10) { // Condition Checking				
			System.out.println(j); //Incremental / Decremental
			j++;
			break;
			}
			
			System.out.println("********do-while Loop*********");
			
			int k =1; // Initialization
			
			do {
				
				System.out.println(k);
				k=k+1; // Incremental
			} while (k<=10); // Decremental
	}
}
		

