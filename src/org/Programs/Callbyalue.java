package org.Programs;

public class Callbyalue {
	
	int x;
	int y;
	int temp;
	
	public int callvalue(int a, int b) {
		int c = a+b;
		System.out.println("The value of C is : " +c);
		return c;
	}
	
	public void callreference(Callbyalue assign) {
		
		temp = assign.x;
		
		assign.x  = assign.y;
		
		assign.y=temp;
	}
	
	public static void main(String[] args) {
		
		Callbyalue cv = new Callbyalue();
		int x = 10;
		int y = 20;
		// This is called call by value or pass by value, 		
		cv.callvalue(x, y);
		
		
		// Call by reference
		
		cv.callreference(cv);
		cv.x = 100;
		cv.y = 200;
		
		System.out.println("Call By Reference Swapping");
		
		System.out.println(cv.x);
		System.out.println(cv.y);	
		
		
	}

}
