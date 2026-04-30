class Solution {
    public boolean validDigit(int n, int x) {
        int c=0;
        int fc = 0;
        int nc =0;
        while(n!=0){
            int l = n%10;
            if(l==x){
                c++;
            }
            nc = n;
            n /=10;
            if(n==0){
                fc = nc;
            }
        }
        if(fc != x && c>0){
            return true;
        }
        return false;

    }
}