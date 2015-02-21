package com.test.single;

import java.util.LinkedList;

public class TestList {
	
	public static void main(String[] args) {
		java.util.LinkedList<Integer> l = new LinkedList<>();
		
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(9);
		l.add(4);
		l.add(2);
		
		System.out.println(l.toString());
		l.remove(4);
		System.out.println(l.toString());
	}

}
