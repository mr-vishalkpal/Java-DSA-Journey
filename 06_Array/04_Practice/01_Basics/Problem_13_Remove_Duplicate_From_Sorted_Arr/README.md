# Remove Duplicates from Sorted Array

## Problem

Given a **sorted array** `arr[]` of size `n`, rearrange the array so that all **distinct elements appear at the beginning** in sorted order.

Return the **length of the distinct subarray**.

### Note

* The elements **after the distinct elements can be anything**.
* Only the **first part of the array matters**.

---

# Examples

### Example 1

**Input**

```
arr = [2, 2, 2, 2, 2]
```

**Output**

```
[2]
```

**Explanation**

All elements are `2`, so only **one instance** is kept.

---

### Example 2

**Input**

```
arr = [1, 2, 2, 3, 4, 4, 4, 5, 5]
```

**Output**

```
[1, 2, 3, 4, 5]
```

**Explanation**

Duplicate elements are removed while maintaining sorted order.

---

# Approaches

---

# 1️⃣ Using Hash Set (Works for Unsorted Arrays)

### Idea

Use a **HashSet** to track elements that have already appeared.

Steps:

1. Create a `HashSet` to store unique elements.
2. Traverse the array.
3. If the element is **not present in the set**, place it at the current result index.
4. Add the element to the set.

---

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(n)
```

---

### Java Code

```java
import java.util.HashSet;

static int removeDuplicates(int[] arr) {

    HashSet<Integer> set = new HashSet<>();
    int index = 0;

    for (int i = 0; i < arr.length; i++) {

        if (!set.contains(arr[i])) {

            set.add(arr[i]);
            arr[index] = arr[i];
            index++;

        }
    }

    return index;
}
```

---

# 2️⃣ Expected Approach (Two Pointer Method)

### Idea

Since the array is **already sorted**, duplicate elements appear **consecutively**.

We only need to check if the **current element is different from the previous element**.

Use two pointers:

* `i` → tracks position of unique elements
* `j` → scans the array

---

### Algorithm

1. Start with `i = 0`
2. Traverse the array using `j`
3. If `arr[j] != arr[i]`
4. Increment `i` and place the new element at `arr[i]`

---

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

---

### Java Code

```java
static int removeDuplicates(int[] arr) {

    if (arr.length == 0)
        return 0;

    int i = 0;

    for (int j = 1; j < arr.length; j++) {

        if (arr[j] != arr[i]) {

            i++;
            arr[i] = arr[j];

        }
    }

    return i + 1;
}
```

---

# Example Walkthrough

Input:

```
[1, 2, 2, 3, 4, 4, 4, 5, 5]
```

Steps:

```
1 → unique  
2 → unique  
2 → duplicate ❌  
3 → unique  
4 → unique  
4 → duplicate ❌  
4 → duplicate ❌  
5 → unique  
5 → duplicate ❌
```

Final array start:

```
[1, 2, 3, 4, 5]
```

Returned length:

```
5
```

---

# Complexity Comparison

| Approach              | Time Complexity | Space Complexity |
| --------------------- | --------------- | ---------------- |
| Hash Set              | O(n)            | O(n)             |
| Two Pointer (Optimal) | O(n)            | O(1)             |

---

# Recommended Approach

Use the **Two Pointer Method** because:

* No extra space required
* Works perfectly for **sorted arrays**
* Very common **interview question pattern**

```
Time  : O(n)
Space : O(1)
```

---

# Tags

```
Array
Two Pointers
Sorting
LeetCode
DSA
```
