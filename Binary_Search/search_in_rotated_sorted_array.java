class Solution {
    public int search(int[] nums, int target) {
        int k=0, n=nums.length;
        for(int i=1; i<n; i++){
            if(nums[i-1]>nums[i]) k=i;
        }
        for(int i=1; i<n-1; i++){
            if(nums[i-1]>nums[i] && nums[i]<nums[i+1]) k=i;
        }
        int low=0, high=n-1, ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int m=(mid+k)%n;
            if(nums[m]==target) return m;
            else if(nums[m]>target) high=mid-1;
            else low=mid+1;
        }
        return ans;
    }
}


//Question: https://leetcode.com/problems/search-in-rotated-sorted-array/
