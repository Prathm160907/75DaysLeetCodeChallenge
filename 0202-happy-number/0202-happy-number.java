class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        while(fast!=1){
            slow = sumSq(slow);
            fast = sumSq(sumSq(fast));
            if(slow==fast && slow!=1){
                return false;
            }
        }
        return true;
    }
    public int sumSq(int n){
        int sum = 0;
        while(n!=0){
            int l = n%10;
            sum += l*l;
            n /= 10;
        }
        return sum;
    }
}