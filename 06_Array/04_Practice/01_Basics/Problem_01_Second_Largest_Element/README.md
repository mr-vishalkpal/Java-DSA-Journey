#  Second Largest Element in an Array

##  Problem Statement
Given an array of positive integers `arr[]` of size `n`, the task is to find the **second largest distinct element** in the array.  

👉 If the second largest element does not exist, return `-1`.

---

## 📝 Examples

### Example 1
**Input:**  
arr[] = [12, 35, 1, 10, 34, 1]
**Output:**  
34
**Explanation:**  
Largest = 35, Second Largest = 34.

---

### Example 2
**Input:**  

arr[] = [10, 5, 10]
**Output:**  

5
**Explanation:**  
Largest = 10, Second Largest = 5.

---

### Example 3
**Input:**  
arr[] = [10, 10, 10]
**Output:**  

-1
**Explanation:**  
All elements are equal, so no second largest.

---

## ⚙️ Approaches in this folder

This folder contains multiple solutions for the same problem:

1. **Brute Force Approach**  
   - Sort the array (Bubble Sort / Arrays.sort)  
   - Then find the second largest element by scanning from the end.  
   - **Time Complexity:** O(n²) (Bubble sort) or O(n log n) (Arrays.sort)  
   - **Space Complexity:** O(1)  

2. **Better Approach (Two Traversals)**  
   - First traversal: Find the largest element.  
   - Second traversal: Find the second largest distinct element.  
   - **Time Complexity:** O(n)  
   - **Space Complexity:** O(1)  

3. **Expected Approach (One Traversal)**  
   - Keep track of both `largest` and `secondLargest` in a single pass.  
   - Update accordingly.  
   - **Time Complexity:** O(n)  
   - **Space Complexity:** O(1)  

---

## 📂 Folder Structure
SecondLargest/
│── SecondLargest_Brute.java
│── SecondLargest_Better.java
│── SecondLargest_Expected.java
│── README.md
