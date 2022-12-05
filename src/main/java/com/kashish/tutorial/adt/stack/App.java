package com.kashish.tutorial.adt.stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Counter myCounter=new Counter("Shaira");
myCounter.increment();
myCounter.increment();
myCounter.increment();
myCounter.increment();
myCounter.increment();
myCounter.increment();
myCounter.increment();

System.out.println(myCounter.getCurrentValue());
System.out.println(myCounter.toString());

	}

}
