class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int idx = Math.abs(nums[i]) -1;
            nums[idx] = -Math.abs(nums[idx]);
        }
        for(int j=0;j<n;j++){
            if(nums[j]>0){
                list.add(j+1);
            }
        }
        return list;
    }
}