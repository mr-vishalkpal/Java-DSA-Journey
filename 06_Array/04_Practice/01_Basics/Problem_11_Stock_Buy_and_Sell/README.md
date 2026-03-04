# Best Time to Buy and Sell Stock (Single Transaction)

## 🧩 Problem Statement

Given an array `prices[]` of non-negative integers, where each element represents the stock price on a given day, find the maximum profit from at most one transaction (buy and sell).

- Stock must be bought before selling
- If no profit is possible, return 0

## 📥 Input & 📤 Output

**Input:** Integer array `prices[]` of size n  
**Output:** Integer representing maximum profit

## 🧠 Examples

**Example 1:**
```
Input: prices = [7, 10, 1, 3, 6, 9, 2]
Output: 8
Explanation: Buy at 1, sell at 9 → Profit = 8
```

**Example 2:**
```
Input: prices = [7, 6, 4, 3, 1]
Output: 0
Explanation: Prices decreasing, no profit possible
```

## 🛠️ Approaches

### 🚀 Naive Approach: O(n²)
- Try all buy-sell pairs with nested loops
- Track maximum profit
- **Drawback:** Too slow for large arrays

### 🚀 Optimal Approach: O(n) Greedy
**Idea:** Track minimum price seen so far, calculate profit at each step

**Steps:**
1. Initialize `minPrice = Integer.MAX_VALUE`, `maxProfit = 0`
2. For each price: update `minPrice`, calculate `profit = currentPrice - minPrice`
3. Update `maxProfit` if profit is higher
4. Return `maxProfit`

**Complexity:** O(n) time, O(1) space

## 📌 Key Points
- Greedy approach is optimal for single transaction
- One-pass solution sufficient
- Handle edge cases (empty array, single element)

## 🔁 Related Problems
- LeetCode 121: Best Time to Buy and Sell Stock
- GFG: Stock Buy and Sell (One Transaction)

## ✅ Implementation Status
- [ ] Naive O(n²) solution
- [ ] Optimal O(n) solution
- [ ] Edge cases handled

---
**Author:** Vishal Kumar Pal | Java DSA Journey
