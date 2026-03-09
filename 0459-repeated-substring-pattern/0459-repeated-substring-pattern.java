class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<=s.length()/2;i++){
            String sub = s.substring(0,i);
            String check = sub.repeat(s.length()/sub.length());
  
            if(check.equals(s)){
            return true;
        }
        }

        return false;
    }
}