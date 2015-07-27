package com.examples;

public class FibonacciSeries {
	
	//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
	public void printFiboSeries() {
		int [] i  = new int[15];
		i[0] = 0;
		i[1] = 1;
		
		
		for(int j = 2; j < i.length; j++) {
			i[j] = i[j-1] + i[j-2]; // 1 + 0
		}
		
		for(int k =0 ; k <i.length; k++) {
			System.out.print(i[k] + " ");
		}
	}
	
	public static void main(String [] args) {
		FibonacciSeries fs = new FibonacciSeries();
		fs.printFiboSeries();
	}

}
