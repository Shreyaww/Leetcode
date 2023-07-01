class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0], profit = 0;
        int cost = 0;

        for(int i = 1; i < prices.length; i++){
            cost = prices[i] - min;
            profit = Math.max(profit , cost);
            min = Math.min(min, prices[i]);
        }

        return profit;
        // int max = 0;
        // int profit = 0;

        // for(int i = 0; i < prices.length-1; i++){
        //     int max1 = prices[i];
        //     for(int j = i+1; j < prices.length; j++){
        //         max = Math.max(max, prices[j]-max1);
        //     }
        // }
        // return max;

        // int profit = 0;

        // for(int i = 0; i < prices.length; i++){
        //     int buy = prices[i];
        //     int max = buy;
        //     for(int j = i+1; j < prices.length; j++){
        //         max = Math.max(max, prices[j]);
        //     }

        //     profit = Math.max(max-buy, profit);
        // }
        // return profit;
    }
}