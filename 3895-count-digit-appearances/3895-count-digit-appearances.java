class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        int n = nums.length;
        String number = "";
        for(int i =0;i<n;i++){
            number += nums[i];
        }
        char a = (char)(digit + '0');
        for(int j =0;j<number.length();j++){
            if(number.charAt(j)==a){
                count++;
            }
        }
        return count;
    }
}