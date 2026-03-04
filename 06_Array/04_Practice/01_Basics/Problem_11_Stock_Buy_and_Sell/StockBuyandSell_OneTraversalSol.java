// Problem: Given an array prices[] of non-negative integers, representing the prices of the stocks on different days, find the maximum profit possible by buying and selling the stocks on different days when at most one transaction is allowed. Here one transaction means 1 buy + 1 Sell. If it is not possible to make a profit then return 0.
// Solution: One Traversal Soution
// Date: 04-03-2026
// Author: Vishal Kumar 

import java.util.ArrayList;
import java.util.List;

public class StockBuyandSell_OneTraversalSol {
    static int maxProfit(int prices[]) {
        int minSoFar = prices[0];
        int res = 0;

        for(int i = 1; i < prices.length; i++){

            // Update the minimum value seen so far
            minSoFar = Math.min(minSoFar, prices[i]);

            // Update result if we get more profit
            res = Math.max(res, prices[i] - minSoFar);
        }
        return res;
    }    

    public static void main(String args[]) {
        int prices[] = {7, 10, 1, 3, 6, 9, 2};
        System.out.println(maxProfit(prices));
    }
}
