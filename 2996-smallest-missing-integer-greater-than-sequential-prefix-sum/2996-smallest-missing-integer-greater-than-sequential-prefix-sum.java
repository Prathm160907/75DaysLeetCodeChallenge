class Solution {
    public int missingInteger(int[] nums) {

    HashSet<Integer> set = new HashSet<>();
    int cs=nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i-1]+1==nums[i]){
            cs+=nums[i];
        }else{
            break;
        }
    }
    for (int num : nums) {
        set.add(num);
    }
    while(set.contains(cs)){
        cs++;
    }
    return cs;
    }
}