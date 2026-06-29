class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        long ts =0;
        Arrays.sort(nums);
        int i =  nums.length-1;
        while(k>0){
            if(mul!=0){
                ts+= (long)mul*nums[i];
                mul--;
            }else{
                ts += nums[i];
            }
            k--;
            i--;
        }
        return ts;
    }
}