package com.dsa;

import java.util.Arrays;

public class SearchAndSortArray {
	public static int search(int array[], int key) {
		for (int i = 0; i < array.length; i++) {
			if (key == array[i]) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[] = new int[] { 4, 2, 3, 1, 5, 8 };
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		System.out.println();
		Arrays.sort(a1);
		for (int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
		int sol = search(a1, 4);
		System.out.println("Searched array and found at " + sol);

	}

}
