class Solution {
    public String largestEven(String s) {
        if(s.charAt(s.length()-1)=='2'){
            return s;
        }
        StringBuilder sb = new StringBuilder(s);
        while(sb.length()!=0 && sb.charAt(sb.length()-1)!='2'){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}