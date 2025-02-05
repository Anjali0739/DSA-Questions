class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        int min=arr[n-1];
        ans.add(min);
        for(int i=n-2; i>=0; i--){
            if(arr[i]>=min){
                min=arr[i];
                ans.add(min);
            }
        }
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=ans.size()-1; i>=0; i--){
            a.add(ans.get(i));
        }
        return a;
    }
}


//Question: https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=leaders-in-an-array
