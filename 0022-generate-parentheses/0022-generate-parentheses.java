class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        
        
        if (n<1){
            return ans;
        }


        sol(n,0,0,"",ans);

        return ans;
    }
    


    public static List<String> sol(int n, int open ,int close,String curr, List<String> ans){

        
        if(open <n){        
        sol(n , open+1,close,curr+"(",ans);
        }


        if(close<open){
        sol(n,open,close+1,curr+")",ans);
        }
        
        if(open == n && close == n){
            ans.add(curr);
            return ans;
        }

           return ans;
    }
 
}