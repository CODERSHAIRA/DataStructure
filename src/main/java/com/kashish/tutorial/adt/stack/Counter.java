package com.kashish.tutorial.dsa;

public class Counter {
    static String name=null;
	static int i=0;
    
	
	public Counter(String str) {
		// TODO Auto-generated constructor stub
		this.name=str;
	}
	
	public static void increment() {
		i++;
	}

	public static int getCurrentValue() {
		return i;
	}


	public String toString() {
		return name;
	}

}
