class Solution {
    public boolean isSpace(int arr[],int n){
        int c =1;
        int i1=0,i2=0,i3=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n && c==1){
                i1=i;
                c++;
            }else if(arr[i]==n && c==2){
                i2=i;
                c++;
            }else if(arr[i]==n && c==3){
                i3=i;
                c++;
            }
        }
        if(i3-i2 == i2-i1){
            return true;
        }
        return false;
    }
    public int countSpecialIntegers(int[] nums) {
        HashMap <Integer,Integer> map = new HashMap<>();
        HashSet <Integer> set = new HashSet<>();
        int c =0;
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }
        int i1 =0;
        int i2 =0;
        int i3=0;
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i])==3 && isSpace(nums,nums[i])==true){
                set.add(nums[i]);
            }
        }
        return set.size();
    }
}