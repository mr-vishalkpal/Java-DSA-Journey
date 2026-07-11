# Array Reverse

**Last Updated:** 08 Aug, 2025  

## Problem  
Reverse an array `arr[]`.  
Reversing an array means rearranging the elements such that:  
- the first element becomes the last,  
- the second element becomes the second last, and so on.

---

## Examples  

**Input:**  
`arr[] = [1, 4, 3, 2, 6, 5]`  
**Output:**  
`[5, 6, 2, 3, 4, 1]`  
**Explanation:**  
The first element `1` moves to last position, the second element `4` moves to second-last and so on.  

**Input:**  
`arr[] = [4, 5, 1, 2]`  
**Output:**  
`[2, 1, 5, 4]`  
**Explanation:**  
The first element `4` moves to last position, the second element `5` moves to second-last and so on.  

---

## Table of Content  

1. [Naive Approach] Using a Temporary Array — **O(n) Time | O(n) Space**  
2. [Expected Approach - 1] Using Two Pointers — **O(n) Time | O(1) Space**  
3. [Expected Approach - 2] By Swapping Elements — **O(n) Time | O(1) Space**  
4. Using Inbuilt Methods — **O(n) Time | O(1) Space**  

---

## Approaches  

### 1. Naive Approach (Using Temporary Array)  
- Copy elements of the array into another array from end to start.  
- Copy back to the original array.  

Move the left pointer forward and the right pointer backward.

Repeat until the pointers meet.
**⏱️ Time Complexity:** `O(n)`
**💾 Space Complexity:** `O(1)`

## 2. By Swapping Elements

Traverse half of the array.

Swap each element with its corresponding element from the other end.
**⏱️ Time Complexity:** `O(n)`
**💾 Space Complexity:** `O(1)`

## 3. Using Inbuilt Methods

Use Java Collections utility methods.
**⏱️ Time Complexity:** `O(n)`
**💾 Space Complexity:** `O(1)`

## Summary of Approaches
| Approach         | Time Complexity | Space Complexity | Notes              |
| ---------------- | --------------- | ---------------- | ------------------ |
| Naive (Temp Arr) | O(n)            | O(n)             | Extra space used   |
| Two Pointers     | O(n)            | O(1)             | Clean & efficient  |
| Swapping         | O(n)            | O(1)             | Simple iterative   |
| Inbuilt Methods  | O(n)            | O(1)             | One-liner solution |
