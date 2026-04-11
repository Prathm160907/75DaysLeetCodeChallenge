class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length;
        int curr = -1;
        int res = Integer.MAX_VALUE;
        int last1 = -1;
        int last2 = -1;
        for(int k=0;k<n;k++){
            if(nums[k]==1){
                last1 = k;
            }
            if(nums[k]==2){
                last2 = k;
            }
            if(last1!=-1 && last2!=-1){
                curr = Math.abs(last1-last2);
                res = Math.min(res,curr);
            }
        }
        if(res == Integer.MAX_VALUE){
            return -1;
        }else{
            return res;
        }
    }
}