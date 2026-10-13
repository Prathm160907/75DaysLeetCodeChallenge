class Solution {
    public long maxAlternatingSum(int[] nums) {
        int a[] = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            a[i] = nums[i]*nums[i];
        }
        Arrays.sort(a);
        int i =0;
        int j= a.length-1;
        long s=0;
        while(i<=j){
            if(i==j){
                s+=a[i];
                break;
            }
            s+= a[j];
            s-= a[i];
            i++;
            j--;
        }
        return s;
    }
}