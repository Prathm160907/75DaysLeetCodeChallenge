class Solution {
    public int[] concatWithReverse(int[] nums) {
        int ans[] = new int[2*nums.length];
        int i =0;
        for(i =0;i<nums.length;i++){
            ans[i] = nums[i];
        }
        int j = i;
        for(i = nums.length-1;i>=0;i--){
            ans[j] = nums[i];
            j++;
        }
        return ans;
    }
}