class Solution {
    Node constructDLL(int arr[]) {
        // Code here
        Node head=new Node(arr[0]);
        Node curr=head;
        for(int i=1; i<arr.length; i++){
            Node node=new Node(arr[i]);
             node.prev = curr;
            curr.next = node;
            curr = node;
        }
        return head;
    }
}


//Question: https://www.geeksforgeeks.org/problems/introduction-to-doubly-linked-list/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=introduction-to-doubly-linked-list
