class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int n=arr.length;
        HashMap<Integer, Integer> h=new HashMap<>();
        int sum=0, maxlength=0;
        for(int i=0; i<n; i++){
            sum+=arr[i];
            if(sum==k) maxlength=i+1;
            if(h.containsKey(sum-k)){
                maxlength=Math.max(maxlength, i-h.get(sum-k));
            }
            if(!h.containsKey(sum)){
                h.put(sum,i);
            }
        }
        return maxlength;
    }
}

//Question: https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=longest-sub-array-with-sum-k

