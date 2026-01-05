Squaring and Sorting an Array Using Two Pointers (Java)

This project solves the problem of squaring each element in a sorted integer array and producing a new sorted array of squares. Since squaring negative numbers can disturb the sorted order, the two pointers technique is used to efficiently maintain sorting without applying an extra sort operation.

Approach

The input array is already sorted

Two pointers are initialized at the beginning and end of the array

At each step, the squares of both pointer values are compared

The larger square is placed at the current end of the result array

The corresponding pointer is moved inward

The process continues until all elements are processed

Example

Input: [-7, -4, -1, 2, 3, 6, 10]
Output: [1, 4, 9, 16, 36, 49, 100]

Why Two Pointers?

Avoids using built-in sorting

Improves performance compared to brute force methods

Works in linear time for already sorted input

Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(n) (extra array for result)

Technologies Used

Java

Arrays
