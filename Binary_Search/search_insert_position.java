class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0, high=nums.length-1, ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid]>target) high=mid-1;
            else if(nums[mid]<target) {ans=mid+1; low=mid+1;}
        }
        return ans;
    }
}




//Question: https://leetcode.com/problems/search-insert-position/


