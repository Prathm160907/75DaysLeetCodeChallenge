class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // int ct =0;
        // int mct =0;
        // for(int i =0;i<nums.length;i++){
        //     if(nums[i]==1){
        //         ct++;
        //         mct = Math.max(mct,ct);
        //     }else{
        //         ct=0;
        //     }
        // }
        // return mct;
        int i =0,j=0;
        int mx =0;
        while(j<nums.length){
            if(nums[j]==1){
                mx = Math.max(mx,j-i+1);
                j++;
            }else{
                j++;
                i=j;
            }
        }
        return mx;
    }
}