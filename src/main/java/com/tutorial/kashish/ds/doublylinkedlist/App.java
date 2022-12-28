package com.tutorial.kashish.ds.doublylinkedlist;

public class App {

	public static void main(String[] args) {

		
		DoublyLinkedList myList=new DoublyLinkedList();
		myList.insertFirst(10);
		myList.insertFirst(20);
		myList.insertFirst(30);
		myList.insertFirst(40);
		myList.insertFirst(50);
		myList.insertFirst(60);
		myList.insertLast(90);
		myList.insertLast(1111);
		myList.insertLast(9);
		myList.insertFirst(46);
		myList.insertLast(847);
		myList.insertAfter(46, 47);
		myList.deleteLast();
		myList.deleteLast();
		myList.insertLast(123456789);
		myList.displayList();
		
		
		
}
}