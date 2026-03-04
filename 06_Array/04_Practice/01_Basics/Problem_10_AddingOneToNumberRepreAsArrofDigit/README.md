# Adding One to Number Represented as Array of Digits

**Last Updated:** 31 Oct, 2025

## 🧩 Problem Statement

Given a non-negative number represented as an array of digits, add 1 to the number.

- Each element of the array represents a single digit
- The most significant digit is at index 0

## 📥 Input

An integer array `digits[]` representing a number

## 📤 Output

The number after adding 1 (as digits)

## 🧠 Examples

### Example 1

**Input:** `[1, 2, 4]`

**Output:** `[1, 2, 5]`

**Explanation:** 124 + 1 = 125

### Example 2

**Input:** `[9, 9, 9]`

**Output:** `[1, 0, 0, 0]`

**Explanation:** 999 + 1 = 1000

## 🛠️ Approaches

### Approach 1: Using Carry (School Addition Method)

**Idea:** Add 1 starting from the last digit, just like manual addition.

**Algorithm Steps:**
1. Start from the last index
2. If digit is 9: change to 0 and continue carry
3. Otherwise: add 1 and stop
4. If carry remains after loop: insert 1 at the beginning

**Complexity:**
- Time: O(n)
- Space: O(1)

### Approach 2: Optimized Carry Handling

**Idea:** Directly modify digits without explicit carry tracking.

**Algorithm Steps:**
1. Traverse array from end
2. If digit ≠ 9: increment and break
3. If digit = 9: set to 0 and continue
4. If all digits become 0: insert 1 at the beginning

**Complexity:**
- Time: O(n)
- Space: O(1)

### Approach 3: Reverse Technique

**Idea:** Avoid inserting at the front by reversing.

**Algorithm Steps:**
1. Reverse the array
2. Add 1 using normal carry logic
3. Append 1 at the end if carry remains
4. Reverse back to restore order

**Complexity:**
- Time: O(n)
- Space: O(1)

## 📌 Key Notes

- Handles edge cases like `[9, 9, 9]`
- No integer conversion (avoids overflow)
- Common LeetCode & GFG problem

## ✅ Implementation Status

- ✅ Carry-based approach
- ✅ Optimized single-pass solution
- ✅ Alternate reverse approach

---

**Author:** Vishal Kumar Pal | Java DSA Journey
