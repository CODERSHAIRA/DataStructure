package com.kashish.tutorial.adt.stack;

import com.kashish.tutorial.queue.Queue;

public class callQueue {

	public static void main(String[] args) {

		Queue myQueue= new Queue(5);
		myQueue.insert(45);
		myQueue.insert(5);
		myQueue.insert(67);
		myQueue.insert(39);
		myQueue.insert(12);
		myQueue.insert(1);
		myQueue.insert(11);
		myQueue.view();
	}

}
