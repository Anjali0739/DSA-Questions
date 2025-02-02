class Solution {
    public String reverseWords(String s) {
        String[] ss=s.split("[ ]");
        String ans="";
        for(int i=ss.length-1; i>=0; i--){
            ans+=ss[i];
            ans=ans.trim()+" ";
        }
        return ans.trim();
    }
}

//https://leetcode.com/problems/reverse-words-in-a-string/description/