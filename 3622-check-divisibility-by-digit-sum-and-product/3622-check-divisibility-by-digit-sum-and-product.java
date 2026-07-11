class Solution {
    public boolean checkDivisibility(int n) {
        int num =n;
        int sum =0;
        int mul = 1;
        while(n!=0){
            int l = n%10;
            sum += l;
            mul *=l;
            n/=10;
        }
        return num%(sum+mul)==0;
    }
}