class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minbuy=prices[0];

        for(int price:prices){
            maxProfit=Math.max(maxProfit,price-minbuy);
            minbuy=Math.min(minbuy,price);
        }
        return maxProfit;

    }
}
