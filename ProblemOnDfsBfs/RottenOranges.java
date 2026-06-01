class RottenOranges{
    public int orangesRotting(int[][] grid) {
        int m = grid.length ; 
        int n = grid[0].length ; 
        Queue<int[]> que = new LinkedList<>() ; 
        int fresh = 0 ; 
        int vis[][] = new int[m][n] ; 
        for(int i = 0 ; i< m ; i++){
            for(int j = 0 ; j< n ; j++){
                if(grid[i][j]==2){
                    vis[i][j]=2 ; 
                    que.offer(new int[]{i , j}) ; 
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        
        int time = 0 ; 

        while(!que.isEmpty() && fresh>0){
            int size = que.size() ;
            for(int i = 0 ; i < size ; i++){

                int[] cur = que.poll();
                int row = cur[0] ; 
                int col = cur[1] ; 
                int[] drow = {-1 , 0 , 1 , 0} ; 
                int[] dcol = {0 , 1, 0 , -1} ; 
                for(int k = 0 ; k< 4 ; k++){
                    int nrow = row + drow[k] ; 
                    int ncol = col + dcol[k] ; 
                    if(nrow>=0 && nrow<m && ncol>=0 && ncol< n && grid[nrow][ncol]==1 && vis[nrow][ncol]!=2){
                        fresh-- ; 
                        vis[nrow][ncol] =2 ; 
                        que.offer(new int[]{nrow, ncol}) ; 
                    }
                }
            }time++ ;  
        }return fresh==0 ? time : -1 ; 
        
    }
}