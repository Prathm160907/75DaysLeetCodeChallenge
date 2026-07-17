class Solution {
    public int findLucky(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap <>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int ans = -1;
        for (Integer key : map.keySet()) {
            if(key.equals(map.get(key))){
                ans = Math.max(key,ans);
            }
        }
        return ans;
    }
}