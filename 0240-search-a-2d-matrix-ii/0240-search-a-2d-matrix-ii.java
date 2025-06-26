class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {


        return ans(matrix, target,0,matrix[0].length-1);
    }


    boolean ans(int[][] matrix, int target, int i, int j){
        int rows = matrix.length;
        int col = matrix[0].length;

        if(i >= rows || j < 0){
            return false;
        }

        if(matrix[i][j] == target){
            return true;
        }
        else if(matrix[i][j]> target){
            return ans(matrix,target,i,j-1);
        }
        else{
            return ans(matrix, target,i+1,j);
        }

        
    }
    
}