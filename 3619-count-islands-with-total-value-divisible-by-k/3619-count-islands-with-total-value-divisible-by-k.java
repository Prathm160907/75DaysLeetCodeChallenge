class Solution {
    private void dfs(int i,int j,int[][] grid,long sum[]){
        if(i>=grid.length || j>=grid[0].length || i<0 || j<0 || grid[i][j]==0){
            return ;
        }
        sum[0] += grid[i][j];
        grid[i][j] =0;
        dfs(i,j+1,grid,sum);
        dfs(i-1,j,grid,sum);
        dfs(i+1,j,grid,sum);
        dfs(i, j-1, grid, sum);
        
    }
    public int countIslands(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int c =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]!=0){
                    long sum[] = {0};
                    dfs(i,j,grid,sum);
                    if(sum[0]%k==0){
                        c++;
                    }
                }
            }
        }
        return c;
    }
}