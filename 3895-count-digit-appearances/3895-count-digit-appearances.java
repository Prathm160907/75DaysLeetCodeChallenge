class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        int n = nums.length;
        for(int i =0;i<n;i++){
            int a = nums[i];
            while(a!=0){
                int l = a%10;
                if(l == digit){
                    count++;
                }
                a /= 10;
            }
        }
        return count;
    }
}