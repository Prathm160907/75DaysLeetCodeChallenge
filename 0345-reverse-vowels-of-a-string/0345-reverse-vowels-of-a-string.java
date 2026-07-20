class Solution {
    public boolean isVowel(char ch1){
        if(ch1=='a' ||
         ch1=='e' ||
          ch1=='i'||
           ch1=='o' ||
            ch1=='u'||
             ch1=='A'||
              ch1=='E'||
               ch1=='I' ||
               ch1=='O'||
                ch1=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int i=0;
        int j = s.length()-1;
        char[] arr = s.toCharArray();
        while(i<j){
            char ch1 = arr[i];
            char ch2 = arr[j];
             if(!isVowel(ch1)){
                i++;
            }else if(!isVowel(ch2)){
                j--;
            }
            if(isVowel(ch1) && isVowel(ch2)){
                char t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}