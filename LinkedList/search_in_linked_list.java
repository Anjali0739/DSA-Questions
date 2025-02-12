class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        boolean ans=false;
        Node helper=head;
        while(helper!=null){
            if(helper.data==key){
                ans=true;
                break;
            }
            helper=helper.next;
        }
        return ans;
    }
}

//Question: https://www.geeksforgeeks.org/problems/search-in-linked-list-1664434326/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=search-in-linked-list-1664434326
