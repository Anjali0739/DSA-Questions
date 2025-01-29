class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int i=0;
        while(i<=high){
            if(nums[i]==0){
                swap(nums,i,low);
                low++;
            }else if(nums[i]==2){
                swap(nums,i,high);
                high--;
                i--;
            }
            i++;
        }
        return;
    }
    static void swap(int[] a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        return;
    }
}

//Question: https://leetcode.com/problems/sort-colors/submissions/833275001/