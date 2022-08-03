class Solution {
    public int maxProfit(int[] prices) {
        
        
        int maxProfit=0;
        int n=prices.length;
        int currentMin=Integer.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            
            currentMin=Math.min(currentMin, prices[i]);
            maxProfit=Math.max(maxProfit, prices[i]-currentMin);
        }
        return maxProfit;
    }
}