# Rotate Array Left by D Positions

## 🧩 Problem Statement
Given an array of integers `arr[]` of size `n`, rotate the array elements to the **left by `d` positions**.

---

## 📥 Input
- An integer array `arr[]`
- An integer `d` (number of left rotations)

---

## 📤 Output
- The array after rotating it left by `d` positions

---

## 🧠 Examples

### Example 1
**Input:**
arr = {1, 2, 3, 4, 5, 6}
d = 2


**Output:**

{3, 4, 5, 6, 1, 2}


**Explanation:**
- After 1st rotation → `{2, 3, 4, 5, 6, 1}`
- After 2nd rotation → `{3, 4, 5, 6, 1, 2}`

---

### Example 2
**Input:**

arr = {1, 2, 3}
d = 4


**Output:**

{2, 3, 1}


**Explanation:**
Since `d > n`, effective rotations = `d % n = 4 % 3 = 1`

- After 1st rotation → `{2, 3, 1}`

---

## 🛠️ Approaches

### 1️⃣ Naive Approach — Rotate One by One
- Rotate the array left by **1 position**, `d` times.

**Algorithm:**
1. Store the first element.
2. Shift all elements one position to the left.
3. Put the stored element at the end.
4. Repeat `d` times.

**Complexity:**
- ⏱ Time: `O(n × d)`
- 🧠 Space: `O(1)`

**Use Case:**  
Good for understanding basics, but inefficient for large `d`.

---

### 2️⃣ Better Approach — Using Temporary Array
- Store first `d` elements in a temporary array.
- Shift remaining elements to the left.
- Copy temporary elements to the end.

**Complexity:**
- ⏱ Time: `O(n)`
- 🧠 Space: `O(n)`

**Use Case:**  
Simple and faster, but uses extra space.

---

### 3️⃣ Expected Approach — Juggling Algorithm
- Based on **GCD (Greatest Common Divisor)** of `n` and `d`.
- Divide the array into cycles and rotate elements within each cycle.

**Complexity:**
- ⏱ Time: `O(n)`
- 🧠 Space: `O(1)`

**Use Case:**  
Optimal solution for interviews (no extra space).

---

## 📌 Notes
- Always handle cases where `d > n` using: