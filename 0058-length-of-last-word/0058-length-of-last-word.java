class Solution {
    public int lengthOfLastWord(String s) {
        String[] ss = s.split("\s+"); 
        int n = ss.length-1;
        String a = ss[n];
        return a.length();
        
    }
}