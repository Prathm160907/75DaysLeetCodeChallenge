class Solution {
    public int firstUniqueEven(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                boolean unique = true;
                for(int j =0;j<n;j++){
                    if(j!=i && nums[j]==nums[i]){
                        unique = false;
                        break;
                    }
                }
                if(unique == true){
                    return nums[i];
                }
            }

        }
        return -1;
    }
}