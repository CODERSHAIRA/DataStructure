package com.tutorial.kashish.ds.singlylinkedlist;

public class App {

	public static void main(String[] args) {

		
		SinglyLinkedList myList=new SinglyLinkedList();
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