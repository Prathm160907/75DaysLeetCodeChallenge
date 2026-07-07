class Solution {
    public long sumAndMultiply(int n) {
        long x = 0;
        while(n!=0){
            int l = n%10;
            if(l!=0){
                x = x*10+l;
            }
            n/=10;
        }
        long rev = 0;
        while(x!=0){
            long l = x%10;
            rev = rev*10+l;
            x/=10;
        }
        long sum =0;
        long X = rev;
        while(rev!=0){
            long l = rev%10;
            sum+= l;
            rev /= 10;
        }
        return sum*X;
    }
}