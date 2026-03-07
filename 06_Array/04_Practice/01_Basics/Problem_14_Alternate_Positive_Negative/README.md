# Rearrange Array Elements by Sign

## Problem

Given an array `arr[]` of size `n`, rearrange the array so that **positive and negative numbers appear alternately** while maintaining their **relative order**.

### Rules

* The array **must start with a positive number**.
* **0 is considered a positive number**.
* If extra positive or negative numbers remain, place them **at the end of the array**.

---

# Examples

### Example 1

**Input**

```
arr = [1, 2, 3, -4, -1, 4]
```

**Output**

```
[1, -4, 2, -1, 3, 4]
```

**Explanation**

Positive numbers → `[1, 2, 3, 4]`
Negative numbers → `[-4, -1]`

Arrange alternately while maintaining order.

---

# Approaches

---

# 1️⃣ Naive Approach (Array Rotation)

### Idea

Traverse the array and find **out-of-place elements**.

An element is **out-of-place** when:

* Negative number appears at **even index**
* Positive number appears at **odd index**

Once found:

1. Search for the next element with **opposite sign**
2. **Right rotate the subarray** between them
3. Continue the traversal

---

### Time Complexity

```
O(n²)
```

### Space Complexity

```
O(1)
```

---

### Java Code

```java
static void rearrange(int[] arr, int n) {

    int outOfPlace = -1;

    for (int index = 0; index < n; index++) {

        if (outOfPlace >= 0) {

            if ((arr[index] >= 0 && arr[outOfPlace] < 0) ||
                (arr[index] < 0 && arr[outOfPlace] >= 0)) {

                int temp = arr[index];

                for (int i = index; i > outOfPlace; i--)
                    arr[i] = arr[i - 1];

                arr[outOfPlace] = temp;

                if (index - outOfPlace > 2)
                    outOfPlace += 2;
                else
                    outOfPlace = -1;
            }
        }

        if (outOfPlace == -1) {

            if ((arr[index] >= 0 && index % 2 == 1) ||
                (arr[index] < 0 && index % 2 == 0)) {

                outOfPlace = index;
            }
        }
    }
}
```

---

# 2️⃣ Expected Approach (Two Arrays / Two Pointers)

### Idea

Separate numbers into two lists:

* **Positive numbers**
* **Negative numbers**

Then merge them back **alternately**.

Steps:

1. Traverse the array and store:

   * positives in one array
   * negatives in another
2. Fill the original array alternately:

   * positive → negative → positive → negative
3. If elements remain, append them at the end.

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
static int[] rearrange(int[] arr) {

    int n = arr.length;

    int[] pos = new int[n];
    int[] neg = new int[n];

    int p = 0, ng = 0;

    for (int num : arr) {

        if (num >= 0)
            pos[p++] = num;
        else
            neg[ng++] = num;

    }

    int i = 0, pi = 0, ni = 0;

    while (pi < p && ni < ng) {

        arr[i++] = pos[pi++];
        arr[i++] = neg[ni++];

    }

    while (pi < p)
        arr[i++] = pos[pi++];

    while (ni < ng)
        arr[i++] = neg[ni++];

    return arr;
}
```

---

# Example Walkthrough

Input

```
[1, 2, 3, -4, -1, 4]
```

Separate arrays

```
Positive → [1, 2, 3, 4]
Negative → [-4, -1]
```

Merge alternately

```
[1, -4, 2, -1, 3, 4]
```

---

# Complexity Comparison

| Approach             | Time Complexity | Space Complexity |
| -------------------- | --------------- | ---------------- |
| Naive (Rotation)     | O(n²)           | O(1)             |
| Two Arrays (Optimal) | O(n)            | O(n)             |

---

# Key Points

* Order of elements **must remain the same**.
* The array **always starts with a positive number**.
* Extra elements appear **at the end**.

---

# Tags

```
Array
Two Pointers
Greedy
DSA
```
