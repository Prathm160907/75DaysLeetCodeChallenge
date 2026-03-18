class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int low = 0;
        int high =0;
        int res = Integer.MIN_VALUE;
        HashMap <Character,Integer> map = new HashMap <>();
        if(n==0){
            return 0;
        }
        for(high= 0;high<n;high++){
            while(map.containsKey(s.charAt(high))){
                map.remove(s.charAt(low));
                low++;
            }
            map.put(s.charAt(high),1);
            int l = map.size();
            res = Math.max(res,l);
        }
        return res;
    }
}