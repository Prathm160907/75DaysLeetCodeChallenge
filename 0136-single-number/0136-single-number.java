class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        //a^a = 0 and a^0 = a
        for(int i=0;i<nums.length;i++){
            result = result ^ nums[i];
        }
        return result;
    }
}