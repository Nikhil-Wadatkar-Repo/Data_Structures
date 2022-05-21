package com.nt;

public class LinkedList {
	Node head; // head of list

	/* Node Class */
	public LinkedList insertFirst(int data) {
		LinkedList list=new LinkedList();
		Node node=new Node(data);
		node.next=list.head;
		
		list.head=node;
		
		return list;
	}

}
