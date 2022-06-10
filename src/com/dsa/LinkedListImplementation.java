package com.dsa;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1 = new LinkedList<>();
		// adding elements into linked list
		l1.add(22);
		l1.add(34);
		l1.add(43);
		l1.add(56);
		l1.remove();
		Iterator lt = l1.iterator();
		while (lt.hasNext()) {
			System.out.print(lt.next() + " ");
		}
		System.out.println();
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		System.out.println(l1.contains(43));

	}

}
