package Telusko;

import java.util.Scanner;

public class PascalTriangleRecursive {
	
	public static void main(String args[])
	{
		System.out.println("Enter the no.of rows:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPascalTriangleRecursive(n);
	}
	public static int pascalRecursive(int row, int col) {
	    if (col == 0 || col == row) {
	        return 1;
	    } else {
	        return pascalRecursive(row - 1, col - 1) + pascalRecursive(row - 1, col);
	    }
	}

	public static void printPascalTriangleRecursive(int numRows) {
		
		 System.out.println("\nPascal Triangle for "+numRows+" rows is\n");
		 
	    // Print Pascal's Triangle with left spacing
	    for (int i = 0; i < numRows; i++) {
	        for (int j = 0; j < numRows - i - 1; j++) {
	            System.out.print(" ");  // Add left spacing
	        }
	        
	        for (int j = 0; j <= i; j++) {
	            System.out.print(pascalRecursive(i, j) + " ");
	        }
	        
	        System.out.println();
	    }
	}


}
