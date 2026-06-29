class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(x,y)->Integer.compare(x[0],y[0]));
        List<List<Integer>> ans = new ArrayList<>();
        int s1 = intervals[0][0];
        int e1 = intervals[0][1];
        for(int i =1;i<intervals.length;i++){
            int s2 = intervals[i][0];
            int e2 = intervals[i][1];
            if(e1>=s2){
                e1 = Math.max(e1,e2);
            }else{
                ans.add(Arrays.asList(s1,e1));
                s1 = s2;
                e1 = e2;
            }
        }
        ans.add(Arrays.asList(s1,e1));
        //convert list to array
        int[][] result = new int[ans.size()][2];

        for (int i = 0; i < ans.size(); i++) {
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);
        }

        return result;
    }
}