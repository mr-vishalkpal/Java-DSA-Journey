# Trapping Rain Water

**Last Updated:** 27 Sep, 2025

## Problem

Given `n` non-negative integers representing an elevation map where the width of each bar is 1, compute how much water can be trapped after raining.

---

## Examples

**Input:**
`height = [2, 1, 5, 3, 1, 0, 4]`
**Output:**
`6`
**Explanation:**
Bars at indices 1, 4, and 5 will hold water. Total trapped water = 6 units.

**Input:**
`height = [4, 2, 0, 6, 3, 2, 5]`
**Output:**
`11`

---

## Approaches

### 1. Brute Force Approach

* For every element, find the **maximum height on the left** and the **maximum height on the right**.
* Water trapped at that element = `min(leftMax, rightMax) - height[i]`.

⏱️ Time Complexity: **O(n²)**
💾 Space Complexity: **O(1)**

---

### 2. Optimal Approach (Prefix & Suffix Arrays)

* Precompute `leftMax[i]`: maximum height from start to index `i`.
* Precompute `rightMax[i]`: maximum height from end to index `i`.
* Water trapped = `min(leftMax[i], rightMax[i]) - height[i]`.

⏱️ Time Complexity: **O(n)**
💾 Space Complexity: **O(n)**

---

## Summary

| Approach            | Time Complexity | Space Complexity |
| ------------------- | --------------- | ---------------- |
| Brute Force         | O(n²)           | O(1)             |
| Prefix-Suffix Array | O(n)            | O(n)             |
