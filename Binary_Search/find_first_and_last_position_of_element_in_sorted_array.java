class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans=new int[2];
        ans[0]=-1; ans[1]=-1;
        int low=0,start=0, high=nums.length-1,end=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) {ans[0]=mid; high=mid-1;}
            else if(nums[mid]<target) low=mid+1;
            else if(nums[mid]>target) high=mid-1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target) {ans[1]=mid; start=mid+1;}
            else if(nums[mid]<target) start=mid+1;
            else if(nums[mid]>target) end=mid-1;
        }
        return ans;
    }
}

//Question: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
