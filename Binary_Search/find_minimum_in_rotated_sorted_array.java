class Solution {
    public int findMin(int[] nums) {
        int k=0, n=nums.length;
        for(int i=1; i<n; i++){
            if(nums[i-1]>nums[i]) k=i;
        }
        for(int i=1; i<n-1; i++){
            if(nums[i-1]>nums[i] && nums[i]<nums[i+1]) k=i;
        }
        return nums[k];
    }
}

//Question: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

