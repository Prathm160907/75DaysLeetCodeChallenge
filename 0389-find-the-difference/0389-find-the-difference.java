class Solution {
    public char findTheDifference(String s, String t) {
        char res = 0;
        char[] arr = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for(int i =0;i<arr.length;i++){
            res ^= arr[i];
        }
        for(int i =0;i<arr2.length;i++){
            res ^= arr2[i];
        }
        return res;
    }
}