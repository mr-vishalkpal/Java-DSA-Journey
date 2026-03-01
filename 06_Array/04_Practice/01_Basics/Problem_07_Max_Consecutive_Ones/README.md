# Maximum Consecutive 1's in a Binary Array

## 📌 Problem Statement

Given a binary array `arr[]` consisting of only 0s and 1s, find the length of the longest contiguous sequence of 1s in the array.

## 📋 Examples

### Example 1

**Input:**
```java
arr = [0, 1, 0, 1, 1, 1, 1]
```

**Output:**
```
4
```

**Explanation:** Maximum consecutive 1s occur from index 3 to 6.

---

## 🎯 Solutions

### Approach 1: Simple Traversal

**Idea:** Traverse the array once and count consecutive 1s.

**Algorithm:**
1. Initialize `maxCount = 0` and `count = 0`
2. Iterate through the array
3. If current element is 1, increment `count`
4. If current element is 0, update `maxCount` and reset `count`
5. Return `maxCount`

**Complexity:**
- Time: O(n)
- Space: O(1)

---

### Approach 2: Using Bit Manipulation (XOR)

**Idea:** Use XOR to detect when consecutive sequence changes.

**Algorithm:**
1. Initialize `maxCount = 0`, `count = 0`, and `prev = -1`
2. Iterate through the array
3. If `prev XOR current == 0`, increment `count`
4. Else, update `maxCount` and reset `count`
5. Return `maxCount`

**Complexity:**
- Time: O(n)
- Space: O(1)

