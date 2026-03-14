class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int curridx = Integer.MIN_VALUE;
        int finalidx = Integer.MIN_VALUE;
        int i = 0;
        if(n==1){
            return 0;
        }
        if(i==0){
            if(nums[0]>nums[1]){
                finalidx = 0;
            }
        }

        for(i =1;i<n-1;i++){
            if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                curridx = i;
                finalidx = Math.max(curridx , finalidx);
            }
        }
        if(nums[i]>nums[i-1]){
            finalidx = i;
        }
        

        return finalidx;
    }
}