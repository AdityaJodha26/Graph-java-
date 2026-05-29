class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length ; 
        int n = grid[0].length ;
        int count =0  ;
        boolean vis[][] = new boolean[m][n] ; 
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j< n ; j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    dfs(i,j,grid,vis,m,n) ; 
                    count++ ; 
                }

            }
        }
          
        return count ; 
    }public static void dfs(int i , int j , char[][] grid , boolean[][] vis , int m , int n){
        if(i<0 || j<0|| i>=m || j>=n || vis[i][j] || grid[i][j]!='1') return ; 
        vis[i][j] = true ; 

        dfs(i-1 , j , grid , vis , m , n ) ;
        dfs(i+1 , j , grid , vis , m , n ) ;
        dfs(i , j+1 , grid , vis , m , n ) ;
        dfs(i , j-1 , grid , vis , m , n ) ;
    }
}