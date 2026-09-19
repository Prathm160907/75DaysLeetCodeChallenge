class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        int n1 = firstList.length;
        int n2 = secondList.length;
        if(n1==0 || n2==0){
            return new int[][] {};
        }
        List<List<Integer>> ans = new ArrayList<>();
        int i =0;
        int j =0;
        while(i<n1 && j<n2){
            int s1 = firstList[i][0];
            int e1 = firstList[i][1];
            int s2 =secondList[j][0];
            int e2 = secondList[j][1];

            int start = Math.max(s1, s2);
            int end = Math.min(e1, e2);

            if (start <= end) {
                ans.add(Arrays.asList(start, end));
            }
            
            if (e1 < e2) {
                i++;
            } else {
                j++;
            }
        }
        int [][] l = new int[ans.size()][2];
        for(int p =0;p<ans.size();p++){
            for(int q=0;q<2;q++){
                l[p][q] = ans.get(p).get(q);
            }
        }
        return l;
    }
}