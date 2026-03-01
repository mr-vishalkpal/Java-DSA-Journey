Maximum Consecutive 1’s (or 0’s) in a Binary Array
📌 Problem Statement

Given a binary array arr[] consisting of only 0s and 1s, find the length of the longest contiguous sequence of either 1s or 0s in the array.

Example 1

Input:

arr = [0, 1, 0, 1, 1, 1, 1]

Output:

4

Explanation:
Maximum consecutive 1s occur from index 3 to 6.

🚀 Approach 1: Simple Traversal
🔹 Idea

Traverse the array once and count how many times the same value repeats consecutively.

🧩 Algorithm Steps

Initialize:

maxCount → stores maximum streak

count → stores current streak length

Traverse the array from index 1.

If current element equals the previous one, increment count.

Otherwise:

Update maxCount

Reset count to 1

After traversal, update maxCount one last time.

Return maxCount.

⏱️ Complexity

Time Complexity: O(n)

Space Complexity: O(1)

🚀 Approach 2: Using Bit Manipulation (XOR)
🔹 Idea

XOR (^) of two equal bits is 0

If prev ^ current == 0, the sequence continues

🧩 Algorithm Steps

Initialize:

maxCount, count, and prev

Traverse the array:

If XOR result is 0, increment count

Else reset count and update maxCount

Return the maximum streak.

⏱️ Complexity

Time Complexity: O(n)

Space Complexity: O(1)