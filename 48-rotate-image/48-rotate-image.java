class Solution {
    public void rotate(int[][] matrix) {
        
        //transpose it 
        
        int n=matrix.length;
        
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                swap(matrix, i,j);
            }
        }
        
        
        //reverse it
        for(int i=0;i<n;i++){
            
            reverse(matrix[i]);
        }
        
    }
    
    //reverse
    
    private void reverse(int []row){
        
        int n=row.length;
        int i=0;
        int j=n-1;
        
        while(i<j){
            swap1(row, i, j);
            i++;
            j--;
        }
    }
    //swap1
    
    private void swap1(int []row, int i, int j){
        int temp=row[i];
        row[i]=row[j];
        row[j]=temp;
    }
    //swap
    private void swap(int[][]matrix, int i, int j){
        
        int temp=matrix[i][j];
        
        matrix[i][j]=matrix[j][i];
        matrix[j][i]=temp;
    }
}