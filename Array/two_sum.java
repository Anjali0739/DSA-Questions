// Brute force

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int n=nums.length;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(nums[i]+nums[j]==target){
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}


// Optimal solution

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int n=nums.length;
        HashMap<Integer, Integer> a=new HashMap<>();
        for(int i=0; i<n; i++){
            int d=target-nums[i];
            if(a.containsKey(d)){
                ans[0]=a.get(d);
                ans[1]=i;}
             a.put(nums[i], i);
            
        }
        return ans;
    }
}


//Question: https://leetcode.com/problems/two-sum/description/