package com.kashish.tutorial.adt.stack;

public class CallStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				
				Stack theStack=new Stack(5);
				theStack.push(1);
				theStack.push(2);
				theStack.push(3);
				theStack.push(4);
				theStack.push(5);
				
				while(!theStack.isEmpty()){
					long value=theStack.pop();
				System.out.println(value);
				}
				
			}
	}


