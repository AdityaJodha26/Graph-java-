import java.util.* ; 
class Floodfill{
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int initcolor = image[sr][sc] ;
        int delrow[] ={0 , -1 , 0 , +1};
        int delcol[] ={-1 , 0 , +1 , 0};
        int ans[][] = image ; 
        dfs(image , ans , sr , sc ,color ,initcolor ,delrow , delcol );
        return ans ;
    }
    public void dfs(int[][] image , int[][] ans , int row,int col , int color , int initcolor , int[] delrow ,int[] delcol){
        ans[row][col] = color ; 
        int m = image.length ; 
        int n = image[0].length ; 
        for(int i = 0 ; i < 4 ; i++){
            int nrow = row+delrow[i] ;  
            int ncol = col+delcol[i] ;  
            if(nrow>=0 && nrow<m && ncol>=0 && ncol<n && image[nrow][ncol]==initcolor && ans[nrow][ncol]!=color){
                dfs(image, ans , nrow , ncol , color ,initcolor, delrow , delcol);
            }           
        }
    }
}