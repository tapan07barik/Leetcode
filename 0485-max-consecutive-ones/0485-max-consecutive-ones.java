class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int n=nums.length;
        
        int maxOne=0;
        int one=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                maxOne=Math.max(maxOne, one);
                one=0;
            }
            else{
                one++;
            }
        }
        maxOne=Math.max(maxOne, one);
        return maxOne;
    }
}