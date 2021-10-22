package com.functional.program;

import java.io.PrintWriter;
import java.util.Scanner;

public class FunctionalUtility {

	Scanner scanner = new Scanner(System.in);

	// Method Creation for Integer Value
	public int getIntValue() {
		return scanner.nextInt();
	}

	// Method Creation For Double Value
	public double getDoubleValue() {
		return scanner.nextDouble();
	}

	public Integer[][] getIntTwoDArray(int m, int n) {
		Integer[][] array = new Integer[m][n];

		System.out.println("Enter:" + (m * n) + "Integer Value in int array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = getIntValue();
			}
		}
		return array;
	}

	public <t> void printArray(t[][] array, int m, int n) {
		// use of t is template means generic format all
		// (any type of data type value call)
		PrintWriter writer = new PrintWriter(System.out);
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				writer.write(" arr[" + i + "][" + j + "] = " + array[i][j]);
				writer.flush();
			}
			System.out.println();
		}

	}

	public Double[][] getDoubleTwoDArray(int m, int n) {
		Double[][] array = new Double[m][n];
		System.out.println("Enter:" + (m * n) + "Double Value in int array");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = getDoubleValue();
			}
		}
		return array;
	}

}
