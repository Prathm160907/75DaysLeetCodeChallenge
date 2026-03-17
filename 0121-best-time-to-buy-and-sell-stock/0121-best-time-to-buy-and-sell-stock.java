class Solution {
    public int maxProfit(int[] prices) {
        int pro = 0;
        int maxPro = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i =0;i<prices.length;i++){
            if(buyPrice<prices[i]){
                pro = prices[i] - buyPrice;
                maxPro = Math.max(pro,maxPro);
            }else{
                buyPrice = prices[i];
            }
        }
        return maxPro;
        
    }
}