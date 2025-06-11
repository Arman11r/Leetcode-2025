class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        } 
        else if(s.length() > t.length()){
            return false;
        }
        int count = 0;
        int pos = 0;
        for(int i= 0;i<t.length();i++){
            if(pos<s.length() && s.charAt(pos) == t.charAt(i)){
                count ++;
                pos++;
            }
            

        }
        if(pos == s.length()){
                return true;
            }
            else{
                return false;
            }
    }
}