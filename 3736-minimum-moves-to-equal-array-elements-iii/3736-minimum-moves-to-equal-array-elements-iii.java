class Solution {
    private boolean isEqual(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]!=nums[i+1]){
                return false;
            }
        }
        return true;
    }
    public int minMoves(int[] nums) {
        int m =0;
        int max =0;
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
        }
        int k=0;
        while(k<nums.length && !isEqual(nums)){
            m += max-nums[k++];
        }
        return m;
    }
}