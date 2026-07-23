class Solution {
    public int strStr(String haystack, String needle) {
        int i=0;
        while(i<=haystack.length()-needle.length()){
            StringBuilder sb = new StringBuilder(haystack.substring(i,needle.length()+i));
            if(needle.equals(sb.toString())){
                return i;
            }
            i++;
        }
        return -1;
    }
}