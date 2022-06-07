package org.Program_Using_String;

public class Join_Two_Java_Strings {
	
	 public static void main(String[] args) {
		 
		 // concat Method

		    // create first string
		    String first = "Java ";
		    System.out.println("First String: " + first);

		    // create second
		    String second = "Programming";
		    System.out.println("Second String: " + second);

		    // join two strings
		    String joinedString = first.concat(second);
		    System.out.println("Joined String: " + joinedString);
		  }

}
