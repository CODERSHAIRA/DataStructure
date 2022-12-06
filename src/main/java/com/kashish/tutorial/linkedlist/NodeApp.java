package com.kashish.tutorial.linkedlist;

public class NodeApp {

	public static void main(String[] args) {

	   	Node nodeA=new Node();
		  nodeA.data=498;
	  
		  Node nodeB=new Node();
		  nodeB.data=6;
		  
		  Node nodeC=new Node();
		  nodeC.data=72;
		  
		  Node nodeD=new Node();
		  nodeD.data=11;
		  
		  nodeA.next=nodeB;
		  nodeB.next=nodeC;
		  nodeC.next=nodeD;
		  System.out.println(listlength(nodeA));
		  System.out.println(listlength(nodeB));
		  System.out.println(listlength(nodeC));
		  System.out.println(listlength(nodeD));
	}
	public static int listlength(Node aNode) {
		int length=0;
		Node currentNode=aNode;
		while( currentNode!=null) {
			length++;
			 currentNode= currentNode.next;
		}
		return length;
	}
	

}
