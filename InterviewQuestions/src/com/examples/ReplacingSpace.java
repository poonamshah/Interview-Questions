package com.examples;

//Write a method to replace all spaces in a string with ‘%20’
public class ReplacingSpace {

	public void performOperation(String s) {
		char[] c = s.toCharArray();
		int count = 0;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == ' ') {
				count++;
			}
		}

		int newlenght = count * 2 + c.length;
		for (int j = c.length - 1; j > 0; j--) {
			if (c[j] == ' ') {
				c[newlenght - 1] = '%';
				c[newlenght - 2] = '2';
				c[newlenght - 3] = '0';

				newlenght = newlenght - 3;
			} else {
				c[newlenght - 1] = c[j];
				newlenght = newlenght - 1;

			}
		}

	}

	public static void main(String[] args) {

		ReplacingSpace rs = new ReplacingSpace();
		rs.performOperation("This is a String");

	}

}
