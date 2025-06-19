class Solution {
    public boolean checkPowersOfThree(int n) {
        return sol(n, 0);
    }

    public boolean sol(int n, int i) {
        if (n == 0) {
            return true;
        }
        if (n < 0 || Math.pow(3, i) > n) {
            return false;
        }

     
        return sol(n - (int)Math.pow(3, i), i + 1) || sol(n, i + 1);
    }
}
