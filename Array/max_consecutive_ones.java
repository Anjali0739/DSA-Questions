class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int count=0, c=0;
        for(int i=0; i<n; i++) {
           if(nums[i]==0)  c=0;
           else c+=nums[i];

           if(c>count) count=c;
        }
        return count;
    }
}


//Question:https://leetcode.com/problems/max-consecutive-ones/