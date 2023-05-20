# DAY-1

## Problem Statement
Generate Pascal's Triangle using three different methods:
1. Iterative Method: Generating the triangle using iteration.
2. Recursive Method: Generating the triangle using recursion.
3. Memoization Method: Generating the triangle using recursion and memoization.

## Code Explanation

### 1. Iterative Method
The iterative method constructs Pascal's Triangle by using nested loops. It creates a 2D array to store the triangle values. Each row of the triangle is represented by a 1D array. The first and last elements of each row are always 1. For the elements in between, their values are calculated by adding the two elements from the previous row,it is done by using second loop in 'printPascalTriangleIterative()' method. Finally, the triangle is printed with proper left spacing.

### 2. Recursive Method
The recursive method calculates the value of each element in Pascal's Triangle using recursion. The base cases are when the element is at the edge i.e the first and last element's value is 1 of that row. Otherwise, the element's value is recursively calculated by adding the two elements above it by using  'pascalRecursive()' method.

### 3. Memoization Method
The memoization method is an optimization of the recursive method using memoization concept of Dynamic Programming. It stores the calculated values in a map with index as key in form of String to avoid unwanted calculations for the same problem. Before calculating the value of an element, it checks if it has already been calculated and stored in the map. If the value exists, it is retrieved directly. Otherwise, the value is calculated recursively, stored in the map, and then returned. The triangle is printed with proper left spacing.

## Output for 5 rows as follows
```
Enter the no.of rows:
5

Pascal Triangle for 5 rows is

    1 
   1 1 
  1 2 1 
 1 3 3 1 
1 4 6 4 1 
