package com.examples;

public class ReverseString {

	public String performOperation(String s) {

		String reverse = "";
		if (s.length() == 1) {
			return s;
		}
		reverse = reverse + s.charAt(s.length() - 1) + performOperation(s.substring(0, (s.length() - 1)));

		return reverse;
	}

	public static void main(String [] args) {
		
		ReverseString rs = new ReverseString();
		
		System.out.println("Printing reverse String " + rs.performOperation("Hello World"));
	}
}
