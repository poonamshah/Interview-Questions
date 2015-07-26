package com.examples;

import java.util.Stack;

public class StackExample {

	Stack<String> s = new Stack<String>();

	public void performOperation() {

		s.push("5");
		s.push("4");
		s.push("3");
		s.push("2");
		s.push("1");

		s.peek();
		s.setElementAt("cartoon", 2);
		System.out.println("displaying Stack values" + s);

	}

	public static void main(String[] args) {

		StackExample se = new StackExample();
		se.performOperation();

	}

}
