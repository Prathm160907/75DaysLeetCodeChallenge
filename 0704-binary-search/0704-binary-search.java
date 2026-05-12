class Solution {
    public int bs(int[] nums, int target,int l,int h){
        if(l>h){
            return -1;
        }
        int m = l + (h-l)/2;
        if(nums[m]==target){
            return m;
        }else if(nums[m]<target){
            return bs(nums,target,m+1,h);
        }else{
            return bs(nums,target,l,m-1);
        }
    }
    public int search(int[] nums, int target) {
        return bs(nums,target,0,nums.length-1);
    }
}