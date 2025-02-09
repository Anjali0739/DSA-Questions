class Solution {
    // Function to insert a node at the end of the linked list.
    Node insertAtEnd(Node head, int x) {
        // code here
        Node n=new Node(x);
        if(head==null){
            head=n;
            return head;
        }else {
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=n;}
        return head;
    }
}


//Question: https://www.geeksforgeeks.org/problems/linked-list-insertion-1587115620/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=linked-list-insertion
