class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int sum=0, max=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(sum<0) sum=0;
            sum+=nums[i];
            max=Math.max(sum, max);
        }
        return max;
    }
}

//Question: https://leetcode.com/problems/maximum-subarray/