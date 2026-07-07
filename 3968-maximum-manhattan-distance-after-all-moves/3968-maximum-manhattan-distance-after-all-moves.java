class Solution {
    public int maxDistance(String moves) {
        int n = moves.length();
        int hrz =0;
        int ver = 0;
        int und=0;
        for(int i=0;i<n;i++){
            if(moves.charAt(i)=='L'){
                hrz--;
            }else if(moves.charAt(i)=='U'){
                ver++;
            }else if(moves.charAt(i)=='D'){
                ver--;
            }else if(moves.charAt(i)=='R'){
                hrz++;
            }else{
                und++;            
            }
        }
        return Math.abs(hrz)+Math.abs(ver)+und;
    }
}