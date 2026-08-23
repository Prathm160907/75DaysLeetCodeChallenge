class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder(s.length()*8);
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int ch = (int)c;
            String b = binary(ch);
            sb.append(b);
        }
        if(palindrome(sb.toString())){
            return true;
        }
        else{
            return false;
        }
    }
    public String binary(int ch){
        int n = ch;
        String ans = "";
        while(n>0){
            ans += n%2;
            n /=2;
        }
        while(ans.length()<8){
            ans += '0';
        }
        String s = new StringBuilder(ans).reverse().toString();
        return s;
    }
    public boolean palindrome(String sb){
        int i =0;
        int j =sb.length()-1;
        while(i<=j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}