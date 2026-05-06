class Solution {
    
    public int maxProfit(int[] prices) {
        int n = prices.length;
        // int buy = prices[0];
        // int profit = 0;
        // for(int i = 1; i<n; i++){
        //     if(prices[i]<buy){
        //         buy = prices[i];
        //     }
        //     profit = Math.max(profit, prices[i]-buy);
        // }
        // return profit;
        int i = 0;
        int j = 1;
        int maxSum = 0;
        while(j<n){
            if(prices[i]<prices[j]){
                maxSum = Math.max(maxSum, prices[j]-prices[i]);
                j++;
            }
        
            else{
                i = j;
                j++;
            }
        }
        return maxSum;
        
    }
}