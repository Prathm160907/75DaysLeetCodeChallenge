class Solution {
    public int maximum69Number (int num) {
        String N = String.valueOf(num);
        int found = -1;
        for(int i=0;i<N.length();i++){
            if(N.charAt(i)=='6'){
                found = i;
                break;
            }
        }
        if(found==-1){
            return num;
        }
        StringBuilder sb = new StringBuilder(N);
        sb.setCharAt(found,'9');
        int ans = Integer.parseInt(sb.toString());
        return ans;
    }
}