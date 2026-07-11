# Maximum Subarray Sum Problem

Given an integer array `arr[]`, find the subarray (containing at least one element) that has the **maximum possible sum**, and return that sum.
A **subarray** is a continuous part of an array.

---

## Problem Examples

### Example 1

**Input:**
`arr[] = [2, 3, -8, 7, -1, 2, 3]`

**Output:**
`11`

**Explanation:**
The subarray `[7, -1, 2, 3]` has the largest sum = `11`.

---

### Example 2

**Input:**
`arr[] = [-2, -4]`

**Output:**
`-2`

**Explanation:**
The subarray `[-2]` has the largest sum = `-2`.

---

### Example 3

**Input:**
`arr[] = [5, 4, 1, 7, 8]`

**Output:**
`25`

**Explanation:**
The subarray `[5, 4, 1, 7, 8]` has the largest sum = `25`.

---

## Approaches Implemented

### 1. Brute Force (Three Nested Loops) – `MaximumSubArraySum_Brute.java`

* Generate **all subarrays** using 3 loops.
* Calculate sum of each subarray.
* Track the maximum sum.

**Time Complexity:** `O(n^3)`
**Space Complexity:** `O(1)`

---

### 2. Prefix Sum Optimization – `MaxSubArraySum_Using_PrefixArray.java`

* Build a **prefix sum array** where `prefix[i] = arr[0] + arr[1] + ... + arr[i]`.
* Use this to calculate subarray sums in `O(1)` time.
* Check all subarrays using 2 loops.

**Time Complexity:** `O(n^2)`
**Space Complexity:** `O(n)`

---

### 3. Kadane’s Algorithm – `MaxSubArraySum_Using_Kadenes.java`

* Traverse the array once.
* Maintain:

  * `currSum` → maximum sum ending at current index
  * `maxSum` → maximum sum so far
* Reset `currSum` to 0 when it becomes negative.

**Time Complexity:** `O(n)`
**Space Complexity:** `O(1)`

---

## Summary

| Approach      | Time Complexity | Space Complexity |
| ------------- | --------------- | ---------------- |
| Brute Force   | `O(n^3)`        | `O(1)`           |
| Prefix Sum    | `O(n^2)`        | `O(n)`           |
| Kadane’s Algo | `O(n)`          | `O(1)`           |

✅ **Best Choice:** Kadane’s Algorithm (Optimal solution).
