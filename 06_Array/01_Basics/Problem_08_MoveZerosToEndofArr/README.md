# Move All Zeros to End of Array

**Last Updated:** 26 Feb, 2026

## 🧩 Problem Statement

Given an array of integers `arr[]`, move all zeros to the end while maintaining the relative order of non-zero elements. The operation must be in-place if possible.

**Input:** Integer array `arr[]` of size `n`

**Output:** Same array with all zeros moved to the end

---

## 🧠 Examples

### Example 1
- **Input:** `arr = [1, 2, 0, 4, 3, 0, 5, 0]`
- **Output:** `[1, 2, 4, 3, 5, 0, 0, 0]`
- **Explanation:** Three zeros moved to the end, non-zero order preserved.

### Example 2
- **Input:** `arr = [10, 20, 30]`
- **Output:** `[10, 20, 30]`
- **Explanation:** No zeros present.

### Example 3
- **Input:** `arr = [0, 0]`
- **Output:** `[0, 0]`
- **Explanation:** All zeros—no change needed.

---

## 🛠️ Approaches

### 1️⃣ Naive Approach — Temporary Array
**Time:** O(n) | **Space:** O(n)

Copy non-zero elements to a temporary array, then fill remaining positions with zeros.

### 2️⃣ Better Approach — Two Traversals
**Time:** O(n) | **Space:** O(1)

Move non-zero elements to the front, then fill remaining positions with zeros.

### 3️⃣ Optimal Approach — Single Traversal with Swapping
**Time:** O(n) | **Space:** O(1)

Use a pointer to swap non-zero elements, pushing zeros to the end automatically.

---

## ✅ Implementation Status
- [x] Naive approach
- [x] Two traversal approach
- [x] One traversal (optimal) approach

---

**Author:** Vishal Kumar Pal | Java DSA Journey
