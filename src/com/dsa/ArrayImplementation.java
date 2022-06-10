package com.dsa;

public class ArrayImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = new int[6];
		int count = 1;
		for (int i = 0; i < a1.length; i++) {
			a1[i] = count;
			count++;
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}

	}

}
