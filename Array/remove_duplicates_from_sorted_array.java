class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int c=0;
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]) c++;
        }
        int m=(n-c);
        int j=0;
        for(int i=1; i<n; i++){
            if(nums[i]!=nums[j]) {
               nums[j+1]=nums[i];
               j++;
            } 
        }
        return m;
    }
}

//Q: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

