package com.examples;

public class FiboWithRecurssion {
	static int n1 = 0;
	static int n2 = 1;
	int n3 = 0;

	public void fiboOperation(int count) {

		if (count > 0) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
			System.out.print(" " + n3);
			fiboOperation(count - 1);
		}

	}

	public static void main(String[] args) {
		int count = 15;
		FiboWithRecurssion fr = new FiboWithRecurssion();
		System.out.print(n1 + " " + n2);
		fr.fiboOperation(count - 2);
	}

}
