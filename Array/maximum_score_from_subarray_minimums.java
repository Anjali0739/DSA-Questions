//Brute force

class Solution{
    public int pairWithMaxSum(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE, sum=0;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                sum=arr[i]+arr[j];
                max=Math.max(max, sum);
            }
        }
        return max;
    }
}


// optimal method
class Solution {
    // Function to find pair with maximum sum
    public int pairWithMaxSum(int arr[]) {
        // Your code goes here
        int n=arr.length;
        int max=Integer.MIN_VALUE, sum=0;
        for(int i=0; i<n-1; i++){
            sum=arr[i]+arr[i+1];
            max=Math.max(sum,max);
        }
        return max;
    }
}



//Question: https://www.geeksforgeeks.org/problems/max-sum-in-sub-arrays0824/0?category&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=max-sum-in-sub-arrays

