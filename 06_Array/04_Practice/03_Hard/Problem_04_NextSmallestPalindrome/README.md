# Next Smallest Palindrome

## 🧩 Problem Statement

Given a number in the form of an array `num[]` of size `n` (digits from **1 to 9**), find the **next smallest palindrome strictly greater than the given number**.

---

## 📥 Input

* An integer array `num[]` representing a number

---

## 📤 Output

* An array representing the **next smallest palindrome**

---

## 🧠 Examples

### Example 1

**Input**

```
num = [9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2]
```

**Output**

```
[9, 4, 1, 8, 8, 0, 8, 8, 1, 4, 9]
```

---

### Example 2

**Input**

```
num = [2, 3, 5, 4, 5]
```

**Output**

```
[2, 3, 6, 3, 2]
```

---

## 🛠️ Approaches

---

## 1️⃣ Naive Approach — Try All Numbers

### 🔹 Idea

Keep **adding 1** to the number and check if it becomes a palindrome.

### 🧩 Steps

1. Convert array to number
2. Increment by 1
3. Check if palindrome
4. Repeat until found

---

### ⏱️ Complexity

* **Time:** Very High (inefficient)
* **Space:** O(1)

### ⚠️ Drawback

* Extremely slow for large numbers

---

## 2️⃣ Expected Approach — Mirror + Carry Propagation

### 🔹 Idea

Instead of checking all numbers, directly **construct the next palindrome**.

---

## 🧩 Algorithm Steps

### Step 1: Handle Special Case

If all digits are `9`

```
999 → 1001
```

---

### Step 2: Mirror Left to Right

Copy left half to right half

Example:

```
12345 → 12321
```

---

### Step 3: Check Condition

* If mirrored number **> original → done**
* Otherwise → increase middle

---

### Step 4: Handle Middle & Carry

* For **odd length** → increase middle digit
* For **even length** → increase middle pair
* If carry occurs → propagate to left side

---

### Step 5: Mirror Again

After updating left side, copy again to right

---

## 🧠 Example Walkthrough

Input:

```
23545
```

Step 1 (Mirror):

```
23532
```

Not greater than original → update middle

Step 2:

```
23632
```

Final Answer:

```
[2,3,6,3,2]
```

---

## ⏱️ Complexity

| Type  | Complexity |
| ----- | ---------- |
| Time  | O(n)       |
| Space | O(n)       |

---

## 📌 Key Concepts

* Palindrome formation
* Two pointers
* Carry propagation
* Array manipulation

---

## ⚡ Edge Cases

### All 9s

```
[9,9,9] → [1,0,0,1]
```

### Already Palindrome

```
[1,2,1] → [1,3,1]
```

---

## 🔁 Pattern Insight

This problem is a combination of:

* **Array manipulation**
* **Math logic**
* **Carry handling (like addition)**

---

## ✅ Status

* [x] Naive approach understood
* [x] Optimal approach implemented
* [x] Edge cases covered

---

## 🚀 Author

**Vishal Kumar Pal**
Java DSA Journey
