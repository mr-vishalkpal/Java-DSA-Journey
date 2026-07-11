# Sort an Array in Wave Form

**Last Updated:** 22 Jul, 2025

## 🧩 Problem Statement

Given a sorted array `arr[]` of integers (in ascending order), rearrange the elements in-place to form a wave-like array.

An array is in wave form if it follows the pattern:
```
arr[0] ≥ arr[1] ≤ arr[2] ≥ arr[3] ≤ arr[4] ≥ ...
```

### Requirements
- Every even-indexed element should be greater than or equal to its adjacent odd-indexed elements
- Transformation must be done in-place
- No extra array should be used

## 📥 Input & 📤 Output

| Aspect | Details |
|--------|---------|
| **Input** | Sorted integer array `arr[]` of size `n` |
| **Output** | Same array rearranged in wave form |

## 🧠 Examples

### Example 1
```
Input:  [1, 2, 3, 4, 5]
Output: [2, 1, 4, 3, 5]
```

### Example 2
```
Input:  [2, 4, 7, 8, 9, 10]
Output: [4, 2, 8, 7, 10, 9]
```

## 🛠️ Approach: Adjacent Pair Swapping

### Idea
Swap every pair of adjacent elements to create alternating peaks and valleys.

### Algorithm
1. Traverse the array with step size 2 (index 0, 2, 4, ...)
2. Swap `arr[i]` with `arr[i + 1]`
3. Array automatically satisfies wave condition

## ⏱️ Complexity Analysis

| Metric | Value |
|--------|-------|
| **Time** | O(n) |
| **Space** | O(1) |

## ✅ Solution Status
- ✓ In-place solution
- ✓ Optimal time complexity
- ✓ No extra space

---

**Author:** Vishal Kumar Pal | Java DSA Journey
