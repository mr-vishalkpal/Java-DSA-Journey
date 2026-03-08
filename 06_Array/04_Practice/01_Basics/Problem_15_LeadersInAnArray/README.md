# Leaders in an Array

## Problem

Given an array `arr[]` of size `n`, find all **Leader elements** in the array.

### Definition

An element is called a **Leader** if it is **greater than or equal to all elements to its right side**.

### Note

* The **rightmost element is always a leader**.

---

# Examples

### Example 1

**Input**

```
arr = [16, 17, 4, 3, 5, 2]
```

**Output**

```
[17, 5, 2]
```

**Explanation**

* `17` is greater than all elements to its right `[4,3,5,2]`
* `5` is greater than all elements to its right `[2]`
* `2` is the rightmost element → always a leader

---

# Approaches

---

# 1️⃣ Naive Approach (Nested Loops)

### Idea

For every element, check **all elements to its right**.

If the current element is **greater than or equal to all of them**, it is a **leader**.

### Algorithm

1. Traverse the array from `0 → n-1`
2. For each element, compare it with all elements to its right
3. If no greater element is found → it is a leader

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
import java.util.*;

class Leaders {

    static void findLeaders(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n; i++) {

            boolean leader = true;

            for(int j = i + 1; j < n; j++) {

                if(arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if(leader)
                System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] arr = {16,17,4,3,5,2};

        findLeaders(arr);
    }
}
```

---

# 2️⃣ Expected Approach (Suffix Maximum)

### Idea

Instead of checking every element on the right, we can **scan the array from right to left** and keep track of the **maximum element seen so far**.

If the current element is **greater than or equal to the maximum**, it is a **leader**.

---

### Algorithm

1. Start from the **rightmost element**
2. Keep a variable `maxRight`
3. If `arr[i] >= maxRight`

   * Add it to result
   * Update `maxRight`
4. Reverse the result (because we traversed from right)

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
import java.util.*;

class Leaders {

    static ArrayList<Integer> findLeaders(int[] arr) {

        int n = arr.length;

        ArrayList<Integer> result = new ArrayList<>();

        int maxRight = arr[n - 1];

        result.add(maxRight);

        for(int i = n - 2; i >= 0; i--) {

            if(arr[i] >= maxRight) {

                maxRight = arr[i];
                result.add(maxRight);

            }
        }

        Collections.reverse(result);

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {16,17,4,3,5,2};

        System.out.println(findLeaders(arr));
    }
}
```

---

# Example Walkthrough

Input

```
[16, 17, 4, 3, 5, 2]
```

Traverse from right:

```
Start → 2 → leader

5 > 2 → leader

3 < 5 → not leader

4 < 5 → not leader

17 > 5 → leader

16 < 17 → not leader
```

Result

```
[17, 5, 2]
```

---

# Complexity Comparison

| Approach                 | Time Complexity | Space Complexity |
| ------------------------ | --------------- | ---------------- |
| Naive                    | O(n²)           | O(1)             |
| Suffix Maximum (Optimal) | O(n)            | O(1)             |

---

# Key Insight

A leader is simply an element that is **greater than everything to its right**.

Instead of repeatedly checking the right side, we maintain a **running maximum from the right**.

---

# Tags

```
Array
Suffix Maximum
Greedy
DSA
```
