class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int ans[] = new int [n];
        for(int i =0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(matrix[i][j]==1){
                    ans[i]++;
                    ans[j]++;
                }
            }
        }
        return ans;
    }
}