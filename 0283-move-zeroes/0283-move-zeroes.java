class Solution {
    public int[] moveZeroes(int[] nums) {
        int n = nums.length;
        int i;
        for(i=0;i<n;i++){
            if(nums[i]==0){
                break;
            }
        }
        for(int j=i+1;j<n;j++){
            if(nums[j]!=0){
                int t = nums[i];
                nums[i]=nums[j];
                nums[j]=t;
                i++;
            }
        }
        return nums;
    }
}