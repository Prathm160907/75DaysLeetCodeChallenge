class Solution {
    public boolean isprime(int num){
        if(num <= 1){
            return false;
        }
        for(int j =2;j<=Math.sqrt(num);j++){
            if(num%j==0){
                return false;
            }
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int sum =0;
        int r =0;
        int num = n;
        while(n!=0){
            int l = n%10;
            r = r*10 + l;
            n /= 10;
        }
        for(int i = Math.min(num,r);i<=Math.max(num,r);i++){
            if(isprime(i)){
                sum += i;
            }
        }
        return sum;
    }
}