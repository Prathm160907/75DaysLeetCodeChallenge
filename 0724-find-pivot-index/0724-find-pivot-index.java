class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum += nums[i];
        }

        int left = 0;
        int right = sum - left - nums[0];
        
        if(left == right){
            return 0;
        }

        for(int i =1;i<n;i++){
            left += nums[i-1];
            right = sum - left - nums[i];
            if(left == right){
                return i;
            }
        }
        return -1;
    }
}