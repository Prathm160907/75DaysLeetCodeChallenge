class Solution {
    public int maxProduct(int n) {
        int largest = 0;
        int secondLargest =0;
        while(n!=0){
            int l = n%10;
            if (l > largest) {
                secondLargest = largest;
                largest = l;
            } else if (l > secondLargest) {
                secondLargest = l;
            }
            n /=10;
        }
        return largest*secondLargest;
    }
}
