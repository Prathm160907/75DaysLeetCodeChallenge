class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i =0;i<s.length()-1;i++){
            int o = s.charAt(i) - '0';
            int se = s.charAt(i+1) - '0';
            int diff = Math.abs(o-se);
            if(diff>2){
                return false;
            }
        }
        return true;
    }
}
