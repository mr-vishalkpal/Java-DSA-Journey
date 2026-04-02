# Minimum Absolute Difference of Subsequence Sum

## 🧩 Problem Statement

Given an integer array `arr[]` and an integer `target`, find a **subsequence** such that the **absolute difference between its sum and target is minimized**.

Return the **minimum possible value of**:

```
|sum - target|
```

---

## 📥 Input

* An integer array `arr[]`
* An integer `target`

---

## 📤 Output

* An integer representing the **minimum absolute difference**

---

## 🧠 Examples

### Example 1

**Input**

```
arr = [5, -7, 3, 5]
target = 6
```

**Output**

```
0
```

**Explanation**
Choose the whole array:

```
5 + (-7) + 3 + 5 = 6
```

So,

```
|6 - 6| = 0
```

---

### Example 2

**Input**

```
arr = [1, 2, 3]
target = -7
```

**Output**

```
7
```

**Explanation**
Choose empty subsequence:

```
sum = 0
|0 - (-7)| = 7
```

---

## 🛠️ Approaches

---

## 1️⃣ Naive Approach — Generate All Subsequences

### 🔹 Idea

Try all possible subsequences and compute their sums.

### 🧩 Steps

1. Generate all subsequences (using recursion or bitmask)
2. Calculate sum of each subsequence
3. Compute `|sum - target|`
4. Track minimum

---

### ⏱️ Complexity

* **Time:** `O(2^n)`
* **Space:** `O(1)`

### ⚠️ Drawback

* Not feasible for large `n`

---

## 2️⃣ Expected Approach — Meet in the Middle

### 🔹 Idea

Split the array into two halves and process them separately to reduce complexity.

---

## 🧩 Algorithm Steps

### Step 1: Split Array

Divide array into two halves:

```
Left half
Right half
```

---

### Step 2: Generate All Subset Sums

* Generate all possible sums of left half → `leftSums`
* Generate all possible sums of right half → `rightSums`

---

### Step 3: Sort One Half

Sort `rightSums` for binary search.

---

### Step 4: Find Closest Sum

For each sum in `leftSums`:

* Find value in `rightSums` such that:

```
leftSum + rightSum ≈ target
```

* Use **binary search** to find closest value

---

### Step 5: Track Minimum Difference

```
minDiff = min(minDiff, |(leftSum + rightSum) - target|)
```

---

## ⏱️ Complexity

| Type  | Complexity              |
| ----- | ----------------------- |
| Time  | O(2^(n/2) log(2^(n/2))) |
| Space | O(2^(n/2))              |

---

## 📌 Key Concepts

* Subsequence generation
* Meet in the Middle
* Binary Search
* Optimization from exponential to manageable

---

## ⚡ Edge Cases

### Empty Subsequence

```
Always valid → sum = 0
```

---

### Negative Target

```
Still valid → difference calculated normally
```

---

### Single Element

```
Compare element vs empty subsequence
```

---

## 🔁 Pattern Insight

This problem follows the pattern:

* **Subset / Subsequence Problems**
* Optimization using **Divide & Conquer**
* Useful when `n ≤ 40`

---

## ✅ Status

* [x] Naive approach understood
* [x] Optimal Meet-in-the-Middle approach covered
* [x] Binary search optimization learned

---

## 🚀 Author

**Vishal Kumar Pal**
Java DSA Journey
