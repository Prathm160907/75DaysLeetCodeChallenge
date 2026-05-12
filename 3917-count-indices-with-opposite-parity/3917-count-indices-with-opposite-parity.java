class Solution {
    public int[] countOppositeParity(int[] nums) {
        int en =0;
        int od = 0;
        if(nums.length==1){
            return new int[]{0};
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                en++;
            }else{
                od++;
            }
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0){
                nums[i] = od;
                en--;
            }else{
                nums[i] = en;
                od--;
            }
        }
        return nums;
    }
}