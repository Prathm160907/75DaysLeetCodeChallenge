class Solution {
    public int compareBitonicSums(int[] nums) {
        int pi = 0;
        int i =0;
        while(i<nums.length-1 && nums[i+1]>nums[i]){
            i++;
        }
        pi =i;
        long fs =0;
        long ls =0;
        for(int k=0;k<=pi;k++){
            fs += nums[k];
        }
        for(int j=pi;j<nums.length;j++){
            ls += nums[j];
        }
        if(fs>ls){
            return 0;
        }else if(fs<ls){
            return 1;
        }
        return -1;
    }
}