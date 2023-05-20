### DAY-1
## Problem Statement
Pascal's Triangle is a triangular array of numbers in which each number is the sum of the two numbers directly above it. The triangle starts with a 1 at the top, and each subsequent row is constructed by adding adjacent values from the row above.

The goal of this project is to generate Pascal's Triangle and print it with proper left spacing using three different methods:
1. Iterative Method: Generating the triangle using iteration.
2. Recursive Method: Generating the triangle using recursion.
3. Memoization Method: Generating the triangle using recursion and memoization.

## Code Explanation

### 1. Iterative Method
The iterative method constructs Pascal's Triangle by using nested loops. It creates a 2D array to store the triangle values. Each row of the triangle is represented by a 1D array. The first and last elements of each row are always 1. For the elements in between, their values are calculated by adding the two elements from the previous row. Finally, the triangle is printed with proper left spacing.

### 2. Recursive Method
The recursive method calculates the value of each element in Pascal's Triangle using recursion. The base cases are when the element is at the edge (column 0 or column equal to the row), where its value is 1. Otherwise, the element's value is recursively calculated by adding the two elements above it. The triangle is then printed with proper left spacing.

### 3. Memoization Method
The memoization method is an optimization of the recursive method using memoization. It stores the calculated values in a map to avoid redundant calculations. Before calculating the value of an element, it checks if it has already been calculated and stored in the map. If the value exists, it is retrieved directly. Otherwise, the value is calculated recursively, stored in the map, and then returned. The triangle is printed with proper left spacing.

## How to Use
1. Clone the repository to your local machine.
2. Open the project in your preferred Java development environment.
3. Run the `PascalTriangle.java` file.
4. The program will ask for the number of rows for Pascal's Triangle.
5. Enter the desired number of rows and press Enter.
6. The program will generate and print Pascal's Triangle using the three different methods: iterative, recursive, and memoization.

Feel free to modify the code or experiment with different inputs to observe the different methods' performance and results.

