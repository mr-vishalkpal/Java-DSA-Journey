// Problem: Given an array prices[] representing stock prices, find the maximum total profit that can be earned by buying and selling the stock any number of times.
// Solution: By Trying all Possibility
// Date: -5-03-2026
// Author: Vishal Kumar


public class StockBuySellMultTrans_usingAllPosi{
    
    // Recursive function to find max profit
    static int maxProfitRec(int price[], int start, int end){
        int res = 0;

        // Try every possible pair of buy (i) and sell (j)
        for(int i = start; i < end; i++){
            for(int j = i + 1; j <= end; j++){

                //Valid transaction if selling price > buying price
                if(price[j] > price[i]){

                    // Current profit + profit from left and right parts
                    int curr = (price[j] - price[i]) +
                    maxProfitRec(price, start, i - 1) + 
                    maxProfitRec(price, j + 1, end);
                res = Math.max(res, curr);    
                }
            }
        }
        return res;
    }

    static int maxProfit(int prices[]) {
        return maxProfitRec(prices, 0, prices.length - 1);
    }

    public static void main(String args[]) {
        int prices[] = {100, 180, 260, 310, 40, 535, 695};
        System.out.println(maxProfit(prices));
    }
}
