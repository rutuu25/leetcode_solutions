class Solution {
    public int maxProfit(int[] prices) {
        int MaxProfit=0;
        int BuyPrice= Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(BuyPrice<prices[i]){
                int profit=prices[i]-BuyPrice;
                MaxProfit= Math.max(MaxProfit,profit);
            }
            else{
                BuyPrice= prices[i];
            }
        }
        return MaxProfit;
    }
}