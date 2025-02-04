class Solution {
    static Node constructLL(int arr[]) {
        // code here
        Node node=new Node(arr[0]);
        Node curr=node;
        int n=arr.length;
        for(int i=1; i<n ; i++){
            curr.next=new Node(arr[i]);
            curr=curr.next;
        }
        return node;
    }
}


//Question: https://www.geeksforgeeks.org/problems/introduction-to-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-linked-list
