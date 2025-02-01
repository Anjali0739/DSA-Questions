// Brute force

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(prices[i]<prices[j]){
                    maxprofit=Math.max(prices[j]-prices[i], maxprofit);
                }
            }
        }
        return maxprofit;
    }
}


//Optimal with additional O(n) space complexity

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit=0, max=prices[n-1];
        int help[] =new int[n];
        for(int i=n-1; i>=0; i--){
            max=Math.max(max, prices[i]);
            help[i]=max;
        }
        for(int i=0; i<n; i++){
           maxprofit=Math.max(help[i]-prices[i], maxprofit);
        }
        return maxprofit;
    }
}


// Most Optimal

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit=0, max=prices[n-1];
        for(int i=n-1; i>=0; i--){
            max=Math.max(max, prices[i]);
            maxprofit=Math.max(max-prices[i], maxprofit);
        }
        return maxprofit;
    }
}

// most most optimal  --best best one

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxprofit=0, min=prices[0];
        for(int i=0; i<n; i++){
            min=Math.min(min, prices[i]);
            maxprofit=Math.max(prices[i]-min, maxprofit);
        }
        return maxprofit;
    }
}



//Question: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/