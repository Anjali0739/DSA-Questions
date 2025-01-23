class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ans=nums.length;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=i){ ans=i; break;}
        }
        return ans;
    }
}

//Question: https://leetcode.com/problems/missing-number/