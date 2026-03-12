class Solution {
    public boolean isPalindrome(int x) {
        int copy = 0;
        int org = x;
        int l;
        if(x<0){
            return false;
        }
        while(x!=0){
            l = x % 10;
            copy = copy*10 + l;
            x /=10;
        }
        if(copy == org){
            return true;
        }else{
            return false;
        }
    }
}