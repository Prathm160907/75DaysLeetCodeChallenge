class Solution {
    public int distributeCandies(int[] c) {
        HashMap <Integer,Integer> map = new HashMap <>();
        int n = c.length;
        for(int i =0;i<n;i++){
            if(map.containsKey(c[i])){
                map.put(c[i],map.get(c[i])+1);
            }else{
                map.put(c[i],1);
            }
        }
        int uniqueTypes = map.size(); 
        int N = n / 2;
        return Math.min(uniqueTypes, N);
    }
}