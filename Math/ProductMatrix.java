class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] gd = new int[n][m];
        int MOD = 12345;
        
        long runningProduct = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                gd[i][j]=(int)runningProduct;
                runningProduct=(grid[i][j]*runningProduct)%MOD;
            }
        }
        runningProduct=1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                gd[i][j]=(int)(runningProduct*gd[i][j])%MOD;
                runningProduct=(grid[i][j]*runningProduct)%MOD;
            }
        }
        return gd;
    }
}
