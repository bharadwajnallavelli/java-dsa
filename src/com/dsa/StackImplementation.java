package com.dsa;

import java.util.Iterator;
import java.util.Stack;

public class StackImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		push
//		pop
//		isEmpty
//		Empty
//		peek
//		search
//		size
//		sort
		Stack<Integer> s1 = new Stack<>();
		s1.push(6);
		s1.push(1);
		s1.push(9);
		s1.push(3);
		System.out.println(s1);
		s1.pop();
		System.out.println(s1);
		System.out.println(s1.isEmpty());
		System.out.println(s1.peek());
		s1.sort(null);
		System.out.println(s1);
		System.out.println(s1.search(1));
		System.out.println(s1.size());
		Iterator it = s1.iterator();
		while (it.hasNext()) {
			Object s2 = it.next();
			System.out.print(s2);
		}

	}

}
