package com.test.single;


public class LinkedList {
	Node head = null;
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		Node temp = this.head;
		while(temp != null){
			sb.append(temp.n).append(", ");
			temp = temp.next;
		}
		return sb.toString();
	}

	public void add(int n){
		Node node = new Node(n);
		if(head == null){
			head = node;
			return;
		}
		Node last = getEnd();
		last.next = node;
	}
	
	public void remove(int n){
		Node temp = this.head;
		Node prev = null;
		Node toDel = null;
		while(temp != null){
			prev = temp;
			if(temp.n == n){
				toDel = temp;
				temp = temp.next;
				prev.next = temp;
				toDel.next = null;
			} else{
				temp = temp.next;
			}
		}
		
	}
	
	private Node getEnd() {
		Node temp = this.head;
		while(temp.next != null){
			temp = temp.next;
		}
		return temp;
	}


	private class Node{
		public Node(int n) {
			this.n = n;
		}
		int n;
		Node next = null;
	}
	
}
