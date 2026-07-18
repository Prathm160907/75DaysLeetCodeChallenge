class Solution {
    public int findGCD(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for(int i=0;i<nums.length;i++){
            max = Math.max(max,nums[i]);
            min = Math.min(min,nums[i]);
        }
        int gcd = 1;
        int i=2;
        while(i<=min){
            if(max%i==0 && min%i==0){
                gcd = Math.max(gcd,i);
            }
            i++;
        }
        return gcd;
    }
}