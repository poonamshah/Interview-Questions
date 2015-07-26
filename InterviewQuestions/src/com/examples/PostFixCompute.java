package com.examples;

/* Sample input
 Spaces are important:
 "65 3 5 * + 83 -" = (65 + (5 * 3)) - 83 = -3
 */
import java.util.Iterator;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class PostFixCompute {
	public static String compute(String input) {
		// Process the list into an ArrayList
		List<String> processedList = new ArrayList<String>();
		if (!input.isEmpty()) {
			StringTokenizer st = new StringTokenizer(input);
			while (st.hasMoreTokens()) {
				processedList.add(st.nextToken());
			}
		} else {
			return "Error";
		}
		// A Stack, we will use this for the calculation
		Stack<String> tempList = new Stack<String>();
		// Iterate over the whole processed list
		Iterator<String> iter = processedList.iterator();
		while (iter.hasNext()) {
			String temp = iter.next();
			if (temp.matches("[0-9]*")) {
				// If the current item is a number (aka operand), push it onto
				// the stack
				tempList.push(temp);
			} else if (temp.matches("[*-/+]")) {
				// If the current item is an operator we pop off the last two
				// elements
				// of our stack and calculate them using the operator we are
				// looking at.
				// Push the result onto the stack.
				if (temp.equals("*")) {
					int rs = Integer.parseInt(tempList.pop());
					int ls = Integer.parseInt(tempList.pop());
					int result = ls * rs;
					tempList.push("" + result);
				} else if (temp.equals("-")) {
					int rs = Integer.parseInt(tempList.pop());
					int ls = Integer.parseInt(tempList.pop());
					int result = ls - rs;
					tempList.push("" + result);
				} else if (temp.equals("/")) {
					int rs = Integer.parseInt(tempList.pop());
					int ls = Integer.parseInt(tempList.pop());
					int result = ls / rs;
					tempList.push("" + result);
				} else if (temp.equals("+")) {
					int rs = Integer.parseInt(tempList.pop());
					int ls = Integer.parseInt(tempList.pop());
					int result = ls + rs;
					tempList.push("" + result);
				}
			} else {
				return "Error";
			}
		}
		// Return the last element on the Stack.
		return tempList.pop();
	}
}