class Solution {
    public int minimumArea(int[][] grid) {
        int mincol =grid[0].length;
        int maxcol = 0;
        int minrow =grid.length;
        int maxrow = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                   mincol =Math.min(mincol,j);
                   maxcol = Math.max(maxcol,j);
                   minrow =Math.min(minrow,i);
                   maxrow = Math.max(maxrow,i);
                }
            }
        }
        return (maxcol-mincol+1) * (maxrow-minrow+1);
    }
}