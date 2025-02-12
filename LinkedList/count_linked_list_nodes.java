class Solution {
    // Function to count nodes of a linked list.
    public int getCount(Node head) {
        // code here
        Node helper=head;
        int count=0;
        while(helper!=null){
            count++;
            helper=helper.next;
        }
        return count;
    }
}

//Question: https://www.geeksforgeeks.org/problems/count-nodes-of-linked-list/0?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=count-nodes-of-linked-list
