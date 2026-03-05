// Problem: Given an array prices[] representing stock prices, find the maximum total profit that can be earned by buying and selling the stock any number of times.
// Solution: By using local minima and maxima
// Date: 5-03-2026
// Author: Vishal Kumar

public class StockBuySellMultTrans_usingLocalMinMax {
    
    static int maxProfit(int prices[]){
        int n = prices.length;
        int lMin = prices[0];
        int lMax = prices[0];
        int res = 0;

        int i = 0;
        while(i < n - 1){

            // Find local minima
            while(i < n - 1 && prices[i] >= prices[i + 1]) {i++;}
            lMin = prices[i];

            // Local Maxima
            while(i < n - 1 && prices[i] <= prices[i + 1]) { i++;}
            lMax = prices[i];

            // Add current profit
            res += (lMax - lMin);
        }
        return res;
    }

    public static void main(String args[]) {
        int prices[] = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxProfit(prices));
    }
}
