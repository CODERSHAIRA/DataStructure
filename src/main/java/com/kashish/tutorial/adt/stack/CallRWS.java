package com.kashish.tutorial.dsa;
public class CallRWS {

	public static void main(String[] args) {

		ReverseWordStack myStack=new ReverseWordStack (20);
		myStack.push('H');
		myStack.push('E');
		myStack.push('L');
		myStack.push('L');
		myStack.push('O');
		
		while(!myStack.isEmpty()) {
			char value= myStack.pop();
			System.out.print(value);
		}
	}

}
