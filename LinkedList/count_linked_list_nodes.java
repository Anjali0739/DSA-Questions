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