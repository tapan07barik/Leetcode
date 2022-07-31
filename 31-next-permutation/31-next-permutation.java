class Solution {
    public void nextPermutation(int[] nums) {
        
        int n=nums.length;
        int i=n-2;
        
        //finding the number thst is greater than the next number
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        // if the num is sorted i will be 0;
        if(i>=0){
            
            int j=n-1;
            ///finding the  number just greater than nums[i]
            while(j>=0 && nums[j]<=nums[i]){
                j--;
            }
            //
            swap(nums, i, j);
        }
        
        
        reverse(nums,i+1, n-1);
    }
    
    private void swap(int[]nums, int i, int j){
        
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    private void reverse ( int []nums , int i , int j){
        while(i<j){
            
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}