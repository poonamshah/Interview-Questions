package com.examples;

/**
 * @author poonamshah
 * To find Unique character in a string
 *
 */
public class UniqueCharacter {
	
	public void performOperation(String s) {
		
		boolean [] charset = new boolean[256];
		for(int i = 0; i < s.length(); i++) {
			int value = s.charAt(i);
			if(charset[value]) {
				System.out.println("Char at position " + i + " is Repeated");
			} else {
				System.out.println("Char at position " + i + " is Unique");
			}
			charset[value] = true;
		}
		
	}
	
	
	
	public static void main(String [] args) {
		
		UniqueCharacter uc = new UniqueCharacter();
		uc.performOperation("saa");
	}
}
