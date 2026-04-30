class Solution {
    public boolean checkRecord(String s) {
        int c =0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                c++;
            }
        }
        if(c>=2){
            return false;
        }
        int cc =0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='L'){
                cc++;
                if(cc==3){
                    return false;
                }
            }else{
                cc=0;
            }
        }
        return true;

    }
}