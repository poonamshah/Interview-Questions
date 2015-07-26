package com.examples;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	Queue<String> q = new LinkedList<String>();

	public void performOperation() {
		q.add("Hello");
		q.add("world");

		System.out.println("Printing queue values" + q);

	}

	public static void main(String[] args) {

		QueueExample qe = new QueueExample();
		qe.performOperation();
	}

}
