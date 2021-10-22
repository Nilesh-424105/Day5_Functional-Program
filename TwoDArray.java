package com.functional.program;

public class TwoDArray {
	// main class
	public static void main(String[] args) {
		// to create an object of functional utility
		FunctionalUtility functionalutility = new FunctionalUtility();
		// Declare a Variable
		int m = 0, n = 0, select;
		// print user input
		System.out.println("1.int 2-D Array");
		System.out.println("2.double 2-D Array");
		System.out.println("3.boolean 2-D Array");
		System.out.println("select the type of array from above");
		// method calling
		select = functionalutility.getIntValue();
		if (select > 0 && select <= 3) {
			System.out.println("Enter the number of coloumns in array:");
			// taking value of column from user
			m = functionalutility.getIntValue();
			System.out.println("Enter the number of row in array:");
			// taking value of row from user
			n = functionalutility.getIntValue();

			// By Using Switch Case to choose option for solving 2-D array
			switch (select) {
			case 1:
				Integer[][] array = functionalutility.getIntTwoDArray(m, n);
				functionalutility.printArray(array, m, n);
				break;
			case 2:
				Double[][] array1 = functionalutility.getDoubleTwoDArray(m, n);
				functionalutility.printArray(array1, m, n);
				break;

			}
		}
	}

}
