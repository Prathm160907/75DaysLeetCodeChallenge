class Solution {
    public boolean isAnagram(String s, String t) {
        int n1= s.length();
        int n2 = t.length();
        if(n1!=n2){
            return false;
        }
        HashMap <Character , Integer> map = new HashMap <>();
        for(int i = 0;i<n1;i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for(int j = 0;j<n2;j++){
            if(map.containsKey(t.charAt(j))){
                map.put(t.charAt(j),map.get(t.charAt(j))-1);
            }else{
                map.put(t.charAt(j),1);
            }
        }
        Set <Character> keyset = map.keySet();
        for(Character key: keyset){
            if(map.get(key)!=0){
                return false;
            }
        }
        return true;
    }
}
