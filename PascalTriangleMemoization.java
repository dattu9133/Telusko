package Telusko;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class PascalTriangleMemoization {

	public static void main(String[] args) {
		
		System.out.println("Enter the no.of rows:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		printPascalTriangleMemoization(n);
		
	}
	
	public static int pascalMemoization(int row, int col, Map<String, Integer> memo) {
        String key = row + "-" + col;
        if (col == 0 || col == row) {
            return 1;
        } else if (memo.containsKey(key)) {
            return memo.get(key);
        } else {
            int value = pascalMemoization(row - 1, col - 1, memo) + pascalMemoization(row - 1, col, memo);
            memo.put(key, value);
            return value;
        }
    }

	public static void printPascalTriangleMemoization(int numRows) {
       
		Map<String, Integer> memo = new HashMap<>();
		
		System.out.println("\nPascal Triangle for "+numRows+" rows is\n");
		
        // Print Pascal's Triangle with left spacing
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows - i - 1; j++) {
                System.out.print(" ");  // Add left spacing
            }

            for (int j = 0; j <= i; j++) {
                int value = pascalMemoization(i, j, memo);
                System.out.print(value + " ");
            }

            System.out.println();
        }
    }
}



