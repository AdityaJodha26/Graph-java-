class Solution {
    class Pair{
        int row ; 
        int col ; 
        int dis ; 
        Pair(int row ,int col ,int dis){
            this.row = row ; 
            this.col = col ; 
            this.dis = dis ;
        }
    } 
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length ; 
        int n = mat[0].length ; 

        boolean vis[][] = new boolean[m][n] ;         
        int ans[][] = new int [m][n] ;         

        Queue<Pair> q = new LinkedList<>() ; 
        for(int i = 0 ;  i < m ; i++){
            for(int j = 0 ; j< n ; j++){
                if(mat[i][j]==0){
                    q.offer(new Pair(i , j , 0)) ; 
                    vis[i][j] = true ; 
                }
            }
        }
        while(!q.isEmpty()){
            Pair cur = q.poll() ;
            
            int r = cur.row ; 
            int c = cur.col ; 
            int d = cur.dis ; 
            ans[r][c] = d ; 

            int drow[] = {-1 , 0 ,1 , 0} ;
            int dcol[] = {0 , -1 , 0 ,1} ;
            for(int i = 0 ; i< 4 ; i++){
                int nr = r+ drow[i] ; 
                int nc = c+dcol[i] ;
                
                if(nr>=0 && nr< m && nc>=0 && nc<n && !vis[nr][nc]){
                    vis[nr][nc]=true ; 
                    q.offer(new Pair(nr ,nc ,d+1)) ; 
                }
            }

        }return ans ; 
    }
}