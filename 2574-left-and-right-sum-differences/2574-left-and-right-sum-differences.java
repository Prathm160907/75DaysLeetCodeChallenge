class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int leftSum[] = new int[n];
        int rightSum[] = new int[n];
        leftSum[0] = 0;
        rightSum[n-1] = 0;
        for(int i =1;i<n;i++){
            leftSum[i] = leftSum[i-1] + nums[i-1];
        }
        for(int j = n-2;j>=0;j--){
            rightSum[j] = rightSum[j+1] + nums[j+1];
        }
        int answer[] = new int[n];
        int ans;
        for(int i =0;i<n;i++){
            ans = leftSum[i] - rightSum[i];
            if(ans<0){
                answer[i] = -1*ans;
            }else{
                answer[i] = ans;
            }
        }
        return answer;
    }
}