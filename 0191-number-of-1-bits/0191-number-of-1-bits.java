class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        String bin = " ";
        while(n!=0){
            int r = n%2;
            bin += r;
            n /= 2;
        }
        int len = bin.length();
        int low = 0;
        int high = len-1;
        char[] arr = bin.toCharArray();
        while(low<high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        for(int k = 0;k<len;k++){
            if(bin.charAt(k)=='1'){
                count++;
            }
        }
        return count;
    }
}