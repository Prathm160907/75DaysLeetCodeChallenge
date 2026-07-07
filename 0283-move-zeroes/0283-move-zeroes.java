class Solution {
    public int[] moveZeroes(int[] nums) {
        int k=0;
        int n = nums.length;
       for(int i=0;i<n;i++){
            if(nums[i]!=0){
                k=i;
                break;
            }
       }
       if(k==n){
        return nums;
       }
       int i=0;
       for(int j=k;j<n;j++){
        if(nums[j]!=0){
            int t = nums[j];
            nums[j] = nums[i];
            nums[i] = t;
            i++;
        }
       }
       return nums;
    }
}