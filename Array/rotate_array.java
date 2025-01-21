// 1st approach
class Solution {
    public void rotate(int[] nums, int k) {
       int  n=nums.length;
       int[]  help=new int[n];
    //    int x=0;
    //    if(k<n) x=(n-k);
    //    else x=k-n;
       int i=0;
       while(n-->0){
        int j=(i+k) % (nums.length);
        help[j]=nums[i];
        i++;
       }
       for(int l=0; l<nums.length; l++){
        nums[l]=help[l];
       }
    }
}



//2nd Approach
class Solution {
    public void rotate(int[] nums, int k) {
       int  n=nums.length;
       int i=0, j=0, help=0;
       while(n-->0){
        j=(j+k)%nums.length;
        help=nums[j];
        nums[j]=nums[i];
        nums[i]=help;
        if(j==i){
            i++;
            j=i;
        }
       }
    }
}


//Question: https://leetcode.com/problems/rotate-array/