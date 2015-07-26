package com.examples;

import java.util.Arrays;

/**
 * @author poonamshah To find whether the string is Anagram
 *
 */
public class Anagram {

	public void performOperation(String s1, String s2) {
		if (s1.length() == s2.length()) {

			char[] c1 = s1.toCharArray();
			char[] c2 = s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);

			if (Arrays.equals(c1, c2)) {
				System.out.println("The Strings are anagram");
			} else {
				System.out.println("The Strings are not an anagram");
			}

		}

	}

	public static void main(String[] args) {

		Anagram a = new Anagram();
		a.performOperation("abc", "abb");
	}

}
