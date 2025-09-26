# Problem: Third Largest Element in an Array of Distinct Elements

📌 **Last Updated:** 23 Jul, 2025  

## Problem Statement  
Given an array of `n` integers, the task is to find the **third largest element**.  
All the elements in the array are **distinct integers**.  

- If the array has fewer than 3 elements → third largest does not exist.  

---

## Examples  

### Example 1:
**Input:**  
`arr[] = {1, 14, 2, 16, 10, 20}`  

**Output:**  
`14`  

**Explanation:**  
- Largest element = 20  
- Second largest = 16  
- Third largest = 14  

---

### Example 2:
**Input:**  
`arr[] = {19, -10, 20, 14, 2, 16, 10}`  

**Output:**  
`16`  

**Explanation:**  
- Largest element = 20  
- Second largest = 19  
- Third largest = 16  

---

## Approaches  

We solve this problem using **three approaches**:  

---

### 1️⃣ Brute Force Approach (Sorting)  
- Sort the array in descending order.  
- Return the element at index `2` (`arr[2]`).  

**Time Complexity:** `O(n log n)`  
**Space Complexity:** `O(1)` (if in-place sort is used)  

👉 File: `ThirdLargest_Brute.java`  

---

### 2️⃣ Better Approach (Two Traversals)  
- First traversal: Find the **largest** element.  
- Second traversal: Find the **second largest** smaller than largest.  
- Third traversal: Find the **third largest** smaller than second largest.  

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`  

👉 File: `ThirdLargest_Better.java`  

---

### 3️⃣ Expected/Optimal Approach (One Traversal, 3 Variables)  
- Keep three variables: `largest`, `secondlargest`, `thirdlargest`.  
- Traverse once, update values by shifting when a new largest/second is found.  

**Time Complexity:** `O(n)`  
**Space Complexity:** `O(1)`  

👉 File: `ThirdLargest_Expected.java`  

---

## Summary  

| Approach       | Time Complexity | Space Complexity | Notes |
|----------------|-----------------|------------------|-------|
| Brute Force    | O(n log n)      | O(1)             | Simple but slower |
| Better         | O(n)            | O(1)             | Needs multiple passes |
| Optimal        | O(n)            | O(1)             | Single traversal |

---
