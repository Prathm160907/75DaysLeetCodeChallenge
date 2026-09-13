class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap <Integer,ArrayList<Integer>> map = new HashMap <>();
        for(int i =0;i<nums.length;i++){
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new ArrayList<>());
            }
            map.get(nums[i]).add(i);
        }

        int ans = 0;
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>(map.values());

        for (int j = 0; j < lists.size(); j++) {

            ArrayList<Integer> indices = lists.get(j);

            if (indices.size() < 3) {
                continue;
            }

            int diff = indices.get(1) - indices.get(0);
            boolean special = true;

            for (int i = 2; i < indices.size(); i++) {

                if (indices.get(i) - indices.get(i - 1) != diff) {
                    special = false;
                    break;
                }
            }

            if (special) {
                ans++;
            }
        }
        return ans;
    }
}