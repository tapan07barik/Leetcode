class Solution {
    public void sortColors(int[] nums) {
        
        
        int one =0;
        int zero=0;
        int two=0;
        
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            
            if(nums[i]==0){
                zero++;
            }
            else if(nums[i]==1){
                one++;
            }
            else{
                two++;
            }
        }
        
        for(int i=0;i<zero;i++){
            nums[i]=0;
        }
        
        for(int i=zero;i<zero+one;i++){
            nums[i]=1;
        }
        
        for(int i=zero+one;i<n;i++){
            nums[i]=2;
        }
    }
}