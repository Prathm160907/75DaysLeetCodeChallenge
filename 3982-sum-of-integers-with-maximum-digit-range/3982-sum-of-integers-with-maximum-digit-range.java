class Solution {
    public int maxDigitRange(int[] nums) {
        int n = nums.length;
        int mdg = Integer.MIN_VALUE;
        int sum =0;

        for(int i =0;i<n;i++){
            int dg = digran(nums[i]);
            if(dg>mdg){
                mdg = dg;
                sum = nums[i];
            }else if(dg==mdg){
                sum += nums[i];
            }
        }
        return sum;
    }
    public int digran(int n){
        int la = Integer.MIN_VALUE;
        int s = Integer.MAX_VALUE;
        while(n!=0){
            int l = n%10;
            la = Math.max(la,l);
            s = Math.min(s,l);
            n /= 10;
        }
        return la-s;
    }
}