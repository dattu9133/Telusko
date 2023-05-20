package Telusko;

import java.util.Scanner;


public class PascalTriangleIterative {

	public static void main(String[] args) 
	{
		System.out.println("Enter the no.of rows:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPascalTriangleIterative(n);
    }
    
    
    public static void printPascalTriangleIterative(int numRows) {
    int[][] triangle = new int[numRows][];
    
    for (int i = 0; i < numRows; i++) {
        triangle[i] = new int[i + 1];
        triangle[i][0] = 1;  // First element of each row is always 1
        
        for (int j = 1; j < i; j++) {
            triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
        }
        
        triangle[i][i] = 1;  // Last element of each row is always 1
    } 
    
    System.out.println("\nPascal Triangle for "+numRows+" rows is\n");
    
    // Print Pascal's Triangle with left spacing
    for (int i = 0; i < numRows; i++)
    {
        for (int j = 0; j < numRows - i - 1; j++)
        {
            System.out.print(" ");  // Add left spacing
        }
        
        for (int j = 0; j <= i; j++) {
            System.out.print(triangle[i][j] + " ");
        }
        
        System.out.println();
    }

	}

}
