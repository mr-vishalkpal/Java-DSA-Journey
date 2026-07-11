// Problem: Given an array prices[] of non-negative integers, representing the prices of the stocks on different days, find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.
// Solution: By exploring all possible pairs
// Date: 04-03-2026
// Author: Vishal Kumar 

import java.util.Arrays;

public class StockBuyandSell_exploringAllPossiPairs {
    static int maxProfit(int prices[]) {
        int n = prices.length;

        int res = 0;

        // Exploring all possible ways to buy and sell stock
        for(int i = 0; i < n - 1; i++){
            for(int j = i + 1; j < n; j++){
                res = Math.max(res, prices[j] - prices[i]);
            }
        }
        return res;
    }    

    public static void main(String args[]) {
        int prices[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}
