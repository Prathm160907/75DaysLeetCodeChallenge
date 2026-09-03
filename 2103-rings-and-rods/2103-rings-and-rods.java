class Solution {
    public int countPoints(String rings) {
        HashMap <Integer,Set<Character>> map = new HashMap <>();
        for(int i=1;i<rings.length();i+=2){
            int rod = rings.charAt(i)-'0';
            char color =rings.charAt(i-1);
            map.putIfAbsent(rod,new HashSet<>());
            map.get(rod).add(color);
        }
        int c =0;
        for (int rod : map.keySet()) {
            if (map.get(rod).size() == 3) {
                c++;
            }
        }
        return c;
    }
}