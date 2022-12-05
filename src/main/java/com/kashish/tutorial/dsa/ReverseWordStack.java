package com.kashish.tutorial.dsa;

public class ReverseWordStack {
    private int maxSize;
    private char[] stackArray;
    private int top;
	public ReverseWordStack(int size) {
    this.maxSize=size;
	this.stackArray=new char[maxSize];
	this.top=-1;
	}

	public void push(char a) {
		if(isFull()) {
			System.out.println("stackArray is already full");
		}
		else {
		top++;
		stackArray[top]=a;
	}
	}
	public char pop() {
		if(isEmpty()) {
			System.out.println("stackArray is already empty");
			return '0';
		}
		else {
		int old_top=top;
		top--;
		return stackArray[old_top];
		}
	}
	public boolean isEmpty() {
    return (top==-1);
	}
	
	public boolean isFull() {
	    return (top==maxSize-1);
		}
	    
	
}
