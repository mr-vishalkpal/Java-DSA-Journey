# Maximum Product of a Triplet (Subsequence of Size 3)

**Last Updated:** 12 Feb, 2025  

---

## 🧩 Problem Statement
Given an integer array `arr[]`, find the **maximum product of any triplet (subsequence of size 3)** present in the array.

A triplet consists of **any three distinct elements**, not necessarily consecutive.

---

## 📥 Input
- An integer array `arr[]` of size `n`

---

## 📤 Output
- An integer representing the **maximum product of any three elements**

---

## 🧠 Examples

### Example 1
**Input:**

arr = [10, 3, 5, 6, 20]

**Output:**

1200

**Explanation:**  
Maximum product is `10 × 6 × 20 = 1200`

---

### Example 2
**Input:**

arr = [-10, -3, -5, -6, -20]

**Output:**

-90

**Explanation:**  
Maximum product is `(-3) × (-5) × (-6) = -90`

---

### Example 3
**Input:**

arr = [1, -4, 3, -6, 7, 0]

**Output:**

168

**Explanation:**  
Maximum product is `(-4) × (-6) × 7 = 168`

---

## 🛠️ Approaches

---

### 1️⃣ Naive Approach — Using Three Nested Loops
Check **all possible triplets** and calculate their product.

**Algorithm:**
- Use three loops to generate all triplets
- Compute product for each triplet
- Keep track of the maximum product

**Complexity:**
- ⏱ Time: `O(n³)`
- 🧠 Space: `O(1)`

**Remarks:**  
Simple but very slow for large arrays.

---

### 2️⃣ Better Approach — Using Sorting
Sort the array in ascending order.

**Observation:**
- Maximum product will be either:
  - Product of **three largest elements**
  - OR product of **two smallest (negative) elements and the largest element**

**Steps:**
1. Sort the array
2. Compute:
   - `arr[n-1] × arr[n-2] × arr[n-3]`
   - `arr[0] × arr[1] × arr[n-1]`
3. Return the maximum of the two

**Complexity:**
- ⏱ Time: `O(n log n)`
- 🧠 Space: `O(1)` (in-place sort)

---

### 3️⃣ Expected (Optimal) Approach — Greedy Method
Traverse the array once and track:
- Largest, second largest, third largest elements
- Smallest and second smallest elements

**Logic:**
- Maximum product is the max of:
  - `max1 × max2 × max3`
  - `min1 × min2 × max1`

**Complexity:**
- ⏱ Time: `O(n)`
- 🧠 Space: `O(1)`

**Note:**  
All values can be found in **a single traversal**.

---

## 📌 Key Notes
- Negative numbers play an important role.
- Two negative numbers can give a **positive product**.
- Always consider both positive-only and mixed sign cases.

---

## ✅ Status
- [x] Naive Approach implemented  
- [x] Sorting-based approach implemented  
- [x] Optimal Greedy approach implemented  

---

## 🚀 Author
**Vishal Kumar Pal**  
Java DSA Journey