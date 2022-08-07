class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length-1;
        int n=matrix.length;
        
        int i=0;
        
        while(m>=0 && i<n){
            
            if(matrix[i][m]==target){
                return true;
            }
            else if(matrix[i][m]>target){
                m--;
            }
            else{
                i++;
            }
        }
        
        return false;
    }
}