package com.kashish.tutorial.queue;

public class Queue {
	
private int maxSize;
private long[] queArray;
private int front;
private int rear;
private int nItems;

  public Queue (int size) {
	  
	  this.maxSize=size;
	  this.queArray= new long[maxSize];
	  front=0;
	  rear=-1;
	  nItems=0;
  }
  public void insert(long j) {
	  if(rear==maxSize-1) {
		  rear=-1;
	  }
		  rear++;
		  queArray[rear]= j;
		  nItems++;
	  }
  
  public void view() {
	  System.out.print("[ ");
	  for(int i=0; i<queArray.length; i++) {
		  System.out.print(queArray[i]+" ");
		  }
		  System.out.println(" ]");
	  }
  


}
