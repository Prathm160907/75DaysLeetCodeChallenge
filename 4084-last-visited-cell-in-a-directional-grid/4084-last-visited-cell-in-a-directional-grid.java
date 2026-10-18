class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        boolean chk[][] = new boolean [grid.length][grid[0].length];
        for(int i =0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                chk[i][j] = false;
            }
        }
        int i =0;
        int j =0;
        int pi =0;
        int pj =0;
        while(i >= 0 && i < grid.length &&
                j >= 0 && j < grid[0].length &&
                !chk[i][j]){

            chk[i][j] = true;
            pi =i;
            pj =j;
            if(grid[i][j]=='R') {
                
                j++;
            }else if(grid[i][j]=='D'){
                
                i++;
            }else if(grid[i][j]=='U'){
                
                i--;
            }else {
                
                j--;
            }
        }

        return new int[] {pi,pj};
    }
}