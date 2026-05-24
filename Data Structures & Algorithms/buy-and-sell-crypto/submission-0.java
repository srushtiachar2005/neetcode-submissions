class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;

        for(int n:prices)
        {
            if(n<minPrice)
            {
                minPrice=n;
            }
            if(n-minPrice>maxProfit)
            {
                maxProfit=n-minPrice;
            }
        }
        return maxProfit;
    }
}
