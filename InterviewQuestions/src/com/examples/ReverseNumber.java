package com.example;
public class ReverseNumber {

	public int reverseNumber(int n) {
		int temp = 0;
		while (n != 0) {
			temp = temp * 10 + n % 10;
			n = n / 10;
		}

		return temp;

	}

	public static void main(String[] args) {

		ReverseNumber rn = new ReverseNumber();
		System.out.println(rn.reverseNumber(1234));

	}

}
