import java.util.*;

class Solution {
    public List<Integer> maxPrimes(int n, int s) {
        List<Integer> l = new ArrayList<>();
        int sum = 0;

        for (int x = 2; x <= n; x++) {
            if (isPrime(x)) {
                if (sum + x <= s) {
                    l.add(x);
                    sum += x;
                } else {
                    break;
                }
            }
        }

        return l;
    }

    private boolean isPrime(int x) {
        if (x < 2) {
            return false;
        }

        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }
}