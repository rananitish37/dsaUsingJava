# dsaUsingJava
Trying to solve as much as DSA question I can

## Weird Algorithm
Time limit: 1.00 s
Memory limit: 512 MB

Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
Your task is to simulate the execution of the algorithm for a given value of n.
Input
The only input line contains an integer n.
Output
Print a line that contains all values of n during the algorithm.


Example
Input:
3

Output:
3 10 5 16 8 4 2 1


## Missing Number
You are given all numbers between 1,2,\ldots,n except one. Your task is to find the missing number.
Input
The first input line contains an integer n.
The second line contains n-1 numbers. Each number is distinct and between 1 and n (inclusive).
Output
Print the missing number.
Constraints

2 \le n \le 2 \cdot 10^5

Example
Input:
5
2 3 1 5

Output:
4

## Repeatations

You are given a DNA sequence: a string consisting of characters A, C, G, and T. Your task is to find the longest repetition in the sequence. This is a maximum-length substring containing only one type of character.
Input
The only input line contains a string of n characters.
Output
Print one integer: the length of the longest repetition.
Constraints

1 \le n \le 10^6

Example
Input:
ATTCGGGA

Output:
3