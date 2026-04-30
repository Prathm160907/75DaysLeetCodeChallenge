class Solution {
    public int[] sortColors(int[] nums) {
        int n = nums.length;
        int c1=0;
        int c0 = 0;
        int c2 =0;
        for(int i =0;i<n;i++){
            if(nums[i]==0){
                c0++;
            }else if(nums[i]==1){
                c1++;
            }else{
                c2++;
            }
        }
        for(int i =0;i<c0;i++){
            nums[i]=0;
        }
        int j;
        for(j = c0;j<(c0+c1);j++){
            nums[j]=1;
        }
        for(int k =j;k<n;k++){
            nums[k]=2;
        }
        return nums;
        // int n = nums.length;
        // int ans[] = new int[n];
        // int j =0;
        // int k = n-1;
        // for(int i =0;i<n;i++){
        //     if(nums[i]==0){
        //         ans[j]=0;
        //         j++;
        //     }else if(nums[i]==2){
        //         ans[k] =2;
        //         k--;
        //     }
        // }
        // for(int t = j;t<=k;t++){
        //     ans[t]= 1;
        // }
        // for(int i = 0; i < n; i++){
        //     nums[i] = ans[i];
        // }
        // return nums;
    }
}