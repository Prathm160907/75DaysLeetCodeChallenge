class Solution {
    public long sumAndMultiply(int n) {
        long org = n;

        long N = 0;
        long l;
        while(n!=0){
            l = n%10;
            if(l!=0){
                N = N*10 + l;
            }
            n /=10;
        }

        long N2 = N;

        long rev = 0;
        while(N!=0){
            l = N%10;
            rev = rev*10 + l;
            N /= 10;
        }

        long sum = 0;
        while(N2 != 0){
            l = N2%10;
            sum += l;
            N2 /= 10;
        }

        return sum*rev;
    }
}