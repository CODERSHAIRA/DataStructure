package com.tutorial.kashish.ds.circularlinkedlist;

import com.tutorial.kashish.ds.singlylinkedlist.SinglyLinkedList;

public class App {

	public static void main(String[] args) {

		CircularLinkedList myList=new CircularLinkedList();
		myList.insertFirst(10);
		myList.insertFirst(20);
		myList.insertFirst(30);
		myList.insertFirst(40);
		myList.insertFirst(50);
		myList.insertFirst(60);
		myList.insertLast(90);
		myList.insertLast(1111);

		myList.insertFirst(9);
		myList.displayList();
	
	}

}
