class Solution {
    public int[] scoreValidator(String[] nums) {
        int sc = 0;
        int cn = 0;
        for(int i =0;i<nums.length;i++){
            if(cn==10) break;
            if(nums[i].equals("W")){
                if(cn==10){
                    return new int[]{sc,cn};
                }else{
                    cn++;
                }
            }
            else if(nums[i].equals("WD") || nums[i].equals("NB") || nums[i].equals("1")) sc++;
            else if(nums[i].equals("2")) sc += 2;
            else if(nums[i].equals("3")) sc += 3;
            else if(nums[i].equals("4")) sc += 4;
            else if(nums[i].equals("5")) sc += 5;
            else if(nums[i].equals("6")) sc += 6;
            else{

            }
        }
        return new int[]{sc,cn};
    }
}