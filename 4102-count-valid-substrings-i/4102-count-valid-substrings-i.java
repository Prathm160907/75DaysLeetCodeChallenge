class Solution {
    public long countValidSubstrings(String s) {
        int n = s.length();
        long total = 0;

        int lastInvalid = -1;

        for (int i = 0; i < n; i++) {

            if (i >= 2 &&
                s.charAt(i - 2) == 'a' &&
                s.charAt(i - 1) == 'b' &&
                s.charAt(i) == 'c') {

                lastInvalid = i - 2;
            }

            total += i - lastInvalid;
        }

        return total;
    }
}