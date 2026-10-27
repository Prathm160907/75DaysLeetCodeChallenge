class Solution {
    public String[] createGrid(int m, int n) {
        char g[][] = new char[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                g[i][j] = '#';
            }
        }
        int i =0;
        int j =0;
        int c=0;
        while(i<m && j<n){
            g[i][j] = '.';
            if(c % 2 == 0) {
                 if (j + 1 < n) {
                     j++; 
                     } else {
                         break; 
                    } } else { 
                    if (i + 1 < m) {
                        i++; 
                    } else {
                        break; 
                    } 
            }
            c++; 
        }
        if(i!=m-1 || j!=n-1){
            if(i==m-1){
                while(j<n){
                    g[i][j++]='.';
                }
            }else{
                while(i<m){
                    g[i++][j]='.';
                }
            }
        }

        String[] ans = new String[m];
        int k=0;
        for(int a=0;a<m;a++){
            String p ="";
        
            for(int b=0;b<n;b++){
                p += g[a][b];
            }
            ans[k++] = p;
        }
        return ans;
    }
}