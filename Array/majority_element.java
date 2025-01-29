class Solution {
    public int majorityElement(int[] nums) {
       int count=0;
       int ans=0;
       for(int n:nums){
           if(count==0){
               ans=n;
           }if(n==ans) count+=1;
           else count-=1;
       }
       return ans;
    }
}

//Question: https://leetcode.com/problems/majority-element/