package com.dsa;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a1[][] = new int[3][4];
		int count = 1;
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[1].length; j++) {
				a1[i][j] = count;
				count++;
			}
		}
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[1].length; j++) {
				System.out.println(a1[i][j]);
			}
		}
	}

}
