# Sum of All Subarrays

**Problem:**
Given an integer array `arr[]`, compute the sum of all possible sub-arrays of the array.
A **sub-array** is a contiguous part of the array.

---

## Examples

**Input:**
`arr[] = [1, 4, 5, 3, 2]`
**Output:**
`116`
**Explanation:**
Sum of all possible subarrays of the array `[1, 4, 5, 3, 2]` is `116`.

**Input:**
`arr[] = [1, 2, 3, 4]`
**Output:**
`50`
**Explanation:**
Sum of all possible subarrays of the array `[1, 2, 3, 4]` is `50`.

---

## Approaches

### 1. Naive Approach (Using Nested Loop)

* Generate all possible subarrays using two loops.
* For each subarray, calculate its sum.
* Add these sums to get the final result.

**Code Reference:** `SumofAllSubArray_Brute.java`

⏱️ Time Complexity: **O(n²)**
💾 Space Complexity: **O(1)**

---

### 2. Expected Approach (Element Contribution Method)

* Instead of generating all subarrays, calculate directly how many times each element contributes to the total sum.
* Formula:
  For element at index `i` → Contribution = `arr[i] * (i + 1) * (n - i)`

  * `(i + 1)` = number of ways to choose a **start** before or at index `i`.
  * `(n - i)` = number of ways to choose an **end** after or at index `i`.
* Total Sum = Sum of contributions of all elements.

**Code Reference:** `SumofAllSubArray_Contribution.java`

⏱️ Time Complexity: **O(n)**
💾 Space Complexity: **O(1)**

---

## Summary

| Approach             | Time Complexity | Space Complexity |
| -------------------- | --------------- | ---------------- |
| Naive (Nested Loop)  | O(n²)           | O(1)             |
| Element Contribution | O(n)            | O(1)             |

---
This problem can be efficiently solved using the Element Contribution Method, which reduces the time complexity to O(n) compared to the naive O(n²) approach. The key insight is recognizing how many subarrays each element contributes to, allowing for a direct calculation of the total sum without generating all subarrays explicitly.
