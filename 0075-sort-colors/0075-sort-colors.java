class Solution {
    public int[] sortColors(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int j =0;
        int k = n-1;
        for(int i =0;i<n;i++){
            if(nums[i]==0){
                ans[j]=0;
                j++;
            }else if(nums[i]==2){
                ans[k] =2;
                k--;
            }
        }
        for(int t = j;t<=k;t++){
            ans[t]= 1;
        }
        for(int i = 0; i < n; i++){
            nums[i] = ans[i];
        }
        return nums;
    }
}