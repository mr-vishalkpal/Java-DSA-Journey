# Maximum Profit by Buying and Selling Stocks

## Problem

Given an array `prices[]` representing stock prices on different days, find the **maximum total profit** that can be earned by buying and selling the stock **any number of times**.

### Rules

* You must **buy before you sell**.
* You **cannot hold more than one stock at a time**.

---

## Example

**Input**

```
prices = [100, 180, 260, 310, 40, 535, 695]
```

**Output**

```
865
```

**Explanation**

Buy on day 0 → Sell on day 3
Profit = `310 - 100 = 210`

Buy on day 4 → Sell on day 6
Profit = `695 - 40 = 655`

Total Profit = `210 + 655 = 865`

---

# Approaches

## 1️⃣ Naive Approach (Recursion)

### Idea

Try **all possibilities** of buying and selling using recursion.

For each day:

* Skip the day
* Buy on that day and try all possible future selling days.

### Time Complexity

```
O(2^n)
```

### Space Complexity

```
O(n)
```

### Code (Java)

```java
static int maxProfit(int[] prices, int start, int end) {

    if (end <= start)
        return 0;

    int profit = 0;

    for (int i = start; i < end; i++) {
        for (int j = i + 1; j <= end; j++) {

            if (prices[j] > prices[i]) {

                int curr_profit = prices[j] - prices[i]
                        + maxProfit(prices, start, i - 1)
                        + maxProfit(prices, j + 1, end);

                profit = Math.max(profit, curr_profit);
            }
        }
    }

    return profit;
}
```

---

# 2️⃣ Better Approach (Local Minima & Maxima)

### Idea

Find:

* **Local minima** → Buy point
* **Local maxima** → Sell point

Add the difference between them.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

### Code (Java)

```java
static int maxProfit(int[] prices) {

    int i = 0;
    int n = prices.length;
    int profit = 0;

    while (i < n - 1) {

        while (i < n - 1 && prices[i + 1] <= prices[i])
            i++;

        if (i == n - 1)
            break;

        int buy = prices[i++];

        while (i < n && prices[i] >= prices[i - 1])
            i++;

        int sell = prices[i - 1];

        profit += sell - buy;
    }

    return profit;
}
```

---

# 3️⃣ Expected Approach (Accumulate Profit)

### Idea

Whenever the **price increases**, take the profit.

If

```
price[i] > price[i-1]
```

Then

```
profit += price[i] - price[i-1]
```

This captures **all upward movements**.

### Time Complexity

```
O(n)
```

### Space Complexity

```
O(1)
```

### Code (Java)

```java
static int maxProfit(int[] prices) {

    int profit = 0;

    for (int i = 1; i < prices.length; i++) {

        if (prices[i] > prices[i - 1]) {
            profit += prices[i] - prices[i - 1];
        }

    }

    return profit;
}
```

---

# Key Insight

Profit is made **only when prices rise**.

Instead of waiting for the **exact lowest and highest points**, we simply **add all increasing differences**.

Example:

```
100 → 180 → 260 → 310
```

Profit =

```
(180-100) + (260-180) + (310-260)
= 80 + 80 + 50
= 210
```

Which is the same as:

```
310 - 100 = 210
```

---

# Final Complexity

| Approach                 | Time Complexity | Space Complexity |
| ------------------------ | --------------- | ---------------- |
| Naive                    | O(2^n)          | O(n)             |
| Local Minima-Maxima      | O(n)            | O(1)             |
| Accumulate Profit (Best) | O(n)            | O(1)             |

---

# Recommended Approach

Use **Accumulating Profit** because it is:

* Simple
* Fast
* Optimal

```
Time: O(n)
Space: O(1)
```
