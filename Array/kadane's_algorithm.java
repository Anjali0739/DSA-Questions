class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    int maxSubarraySum(int arr[]){
        int n=arr.length;
    int max=Integer.MIN_VALUE;
    int sum=0;
       for(int i=0; i<n; i++){
             sum=sum+arr[i];
           if(max<sum){
               max=sum;
           }
           if(sum<0) sum=0;
         
       }
       return max;
        
    }
    
}


//Question: https://www.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1?page=1&sprint=a663236c31453b969852f9ea22507634&sortBy=submissions
