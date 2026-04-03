# Jump Game – Minimum Jumps to Reach End

## 🧩 Problem Statement

Given an array `arr[]` of non-negative integers, where each element represents the **maximum number of steps you can jump forward from that index**, find the **minimum number of jumps required to reach the last index** starting from the first index.

If it is not possible to reach the end, return `-1`.

---

## 📥 Input

* An integer array `arr[]`

---

## 📤 Output

* Minimum number of jumps required to reach the last index
* Return `-1` if not possible

---

## 🧠 Examples

### Example 1

**Input**

```
arr = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
```

**Output**

```
3
```

**Explanation**

* Jump from index 0 → 1
* Jump from index 1 → 4
* Jump from index 4 → last

---

### Example 2

**Input**

```
arr = [1, 4, 3, 2, 6, 7]
```

**Output**

```
2
```

---

### Example 3

**Input**

```
arr = [0, 10, 20]
```

**Output**

```
-1
```

**Explanation**

* Cannot move from index 0

---

## 🛠️ Approaches

---

## 1️⃣ Naive Approach — Recursion

### 🔹 Idea

Try all possible jumps from each index.

### 🧩 Steps

* From index `i`, try all jumps from:

```
i + 1 → i + arr[i]
```

* Recursively compute minimum jumps for each path
* Take minimum among them

---

### ⏱️ Complexity

* **Time:** `O(n^n)`
* **Space:** `O(n)`

### ⚠️ Drawback

* Extremely slow (not practical)

---

## 2️⃣ Better Approach — Dynamic Programming (Tabulation)

### 🔹 Idea

Store minimum jumps needed to reach end from each index.

---

### 🧩 Steps

1. Create `dp[]` of size `n`
2. Initialize last index:

```
dp[n-1] = 0
```

3. Traverse from right to left
4. For each index:

   * Check all reachable positions
   * Store minimum jumps

---

### ⏱️ Complexity

* **Time:** `O(n²)`
* **Space:** `O(n)`

---

## 3️⃣ Expected Approach — Greedy (Best)

### 🔹 Idea

Track the **maximum reachable index** and make a jump only when needed.

---

## 🧩 Algorithm Steps

1. Initialize:

```
jumps = 0
currentEnd = 0
maxReach = 0
```

2. Traverse array:

* Update:

```
maxReach = max(maxReach, i + arr[i])
```

* When you reach `currentEnd`:

  * Increment jump
  * Update:

```
currentEnd = maxReach
```

---

### 🧠 Intuition

* You don’t jump at every step
* You **expand your range first**, then jump
* Each jump covers **maximum distance**

---

## ⏱️ Complexity

| Type  | Complexity |
| ----- | ---------- |
| Time  | O(n)       |
| Space | O(1)       |

---

## 📌 Key Concepts

* Greedy algorithm
* Range expansion
* Optimal decision making

---

## ⚡ Edge Cases

### Cannot Move

```
arr[0] = 0 → return -1
```

---

### Single Element

```
Already at end → return 0
```

---

### Large Jumps

```
Direct jump possible → return 1
```

---

## 🔁 Pattern Insight

This problem is a classic example of:

* **Greedy optimization**
* **Range-based thinking**
* Frequently asked in interviews

---

## ✅ Status

* [x] Recursion understood
* [x] DP approach covered
* [x] Optimal greedy solution learned

---

## 🚀 Author

**Vishal Kumar Pal**
Java DSA Journey
