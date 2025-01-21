class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        int x=0;
        for(int i=0; i<n-1; i++){
            if(nums[i]>nums[i+1]) x=i+1;
        }
        for(int i=0; i<n-1; i++){
            int j=(i+x)%n;
            int k=(i+1+x)%n;
            if(nums[j]>nums[k]) return false;
        }
        return true;
    }
}


// Questions: https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
