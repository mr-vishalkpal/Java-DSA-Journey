// Problem: Given an array prices[] representing stock prices, find the maximum total profit that can be earned by buying and selling the stock any number of times.
// Solution: By Accumalating profit
// Date: 5-03-2026
// Author: Vishal Kumar


public class StockBuySellMultTrans_ByAccumalatingProf {
    
    static int maxProfit(int prices[]) {
        int res = 0;

        // Keep on adding the difference between adjacent when the prices a
        for(int i = 1; i < prices.length; i++){
            if(prices[i] > prices[i - 1])
                res += prices[i] - prices[i - 1];
        }

        return res;
    }

    public static void main(String args[]) {
        int prices[] = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxProfit(prices));
    }
}
