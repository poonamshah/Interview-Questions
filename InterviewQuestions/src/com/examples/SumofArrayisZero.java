package com.examples;

public class SumofArrayisZero {

	int arr[] = { 1, -2, -3, 3, 5, 7, -1, 2, 0 };

	public void performOperation() {

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == 0) {
					System.out.println("Pairs found at position (" + i + "," + j + ") " + " and their Values are  (" + arr[i] + "," + arr[j] + " ) ");
				}
			}
		}

	}

	
	public static void main(String[] args) {
		SumofArrayisZero s = new SumofArrayisZero();
		s.performOperation();
		
	}

}
