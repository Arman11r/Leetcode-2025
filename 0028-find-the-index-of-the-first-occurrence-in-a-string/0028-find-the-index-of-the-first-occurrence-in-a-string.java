class Solution {
    public int strStr(String haystack, String needle) {
        if(!haystack.contains(needle)){
            return -1;
        }
        int a = haystack.indexOf(needle);
        return a;
        
    }
}