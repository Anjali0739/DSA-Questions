class Solution {
    public int search(int[] nums, int target) {
        int low=0, high=nums.length-1, ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) return ans=mid;
            else if(nums[mid]<target) low=mid+1;
            else if(nums[mid]>target) high=mid-1;
        }
        return ans;
    }
}


// Question: https://leetcode.com/problems/binary-search/
