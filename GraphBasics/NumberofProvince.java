class Solution {
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>() ; 
        for(int i = 0 ; i<isConnected.length ; i++){
            adj.add(new ArrayList<>()) ;
        }
        for(int i =0 ; i<isConnected.length ;i++){
            for(int j =0 ; j< isConnected[i].length ; j++){
                if(isConnected[i][j]==1){
                    adj.get(i).add(j) ; 
                }
            }
        }boolean vis[] =new boolean[isConnected.length] ;
        
        int count = 0 ; 
        for(int i = 0 ; i<vis.length ; i++){
           
            if(!vis[i]){
                vis[i]=true; 
                bfs( i , adj , vis) ; 
                count++ ;  
            }
        }return count ; 
        

        
    }public static void bfs(int i , ArrayList<ArrayList<Integer>> adj , boolean[] vis){
        Queue<Integer> que = new LinkedList() ; 
        que.add(i) ; 
        while(!que.isEmpty()){
            int s = que.poll() ;
            for( Integer x : adj.get(s)){
                if(!vis[x]){
                    vis[x] = true ; 
                    que.add(x) ; 
                }
            }
        }
    }
}