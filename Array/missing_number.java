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




//2nd approach

class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        for(int i=0; i<n; i++){
            sum-=nums[i];
        }
        return sum;
    }
}

//Question: https://leetcode.com/problems/missing-number/