class Day2_BestTimeToBuyStock {
    // Problem: Best Time to Buy and Sell Stock
    // Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
    // Time: O(n) | Space: O(1)
    
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) min = prices[i];
            int profit = prices[i] - min;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }
}