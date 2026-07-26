class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        List <Integer> l1 = new ArrayList<>();
        List <Integer> l2 = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for(int num:nums2){
            if(set1.contains(num)){
                set2.add(num);
            }
        }
        for(int num:nums1){
            if(set2.contains(num)){
                continue;
            }else{
                l1.add(num);
            }
        }
        for(int num:nums2){
            if(set2.contains(num)){
                continue;
            }else{
                l2.add(num);
            }
        }
        Set<Integer> s1 = new HashSet<>(l1);
        Set<Integer> s2 = new HashSet<>(l2);
        List<Integer> list1 = new ArrayList<>(s1);
        List<Integer> list2 = new ArrayList<>(s2);
        ans.add(list1);
        ans.add(list2);
        return ans;
    }
}