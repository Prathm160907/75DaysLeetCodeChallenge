class Solution {
    public int passwordStrength(String password) {
        HashSet <Character> set = new HashSet<>();
        int score =0;
        for(int i=0;i<password.length();i++){
            set.add(password.charAt(i));
        }
        for(char x :set){
            int a = (int)x;
            if(a>=97 && a<=122){
                score++;
            }else if(a>=65 && a<=90){
                score += 2;
            }else if(a>=48 && a<=57){
                score += 3;
            }else{
                score += 5;
            }   
        } 
        return score;
    }
}