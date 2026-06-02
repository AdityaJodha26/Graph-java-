import java.util.* ;
class Pair{
    int node ;
    int parent ;

    Pair(int node , int parent) {
        this.node = node ;
        this.parent = parent ; 

    }
} 
class CycleDetectionDfs{
    public static void main(String[] args){
        int n = 6 ; 
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>() ; 
        for(int i = 0 ; i <= n ; i++){
            adj.add(new ArrayList<Integer>()) ; 

        }
        adj.get(1).add(2) ;         
        adj.get(2).add(1) ;         
        adj.get(3).add(1) ;         

        adj.get(1).add(3) ; 
        adj.get(2).add(4) ; 
        adj.get(4).add(2) ; 
        adj.get(5).add(3) ; 
        adj.get(3).add(5) ; 
         
        
        adj.get(6).add(5) ; 
        adj.get(5).add(6) ; 
        for(int i = 0 ; i <adj.size() ; i++){
            System.out.print(i+" -> ") ; 
            for(Integer neighbour  : adj.get(i)){
                System.out.print(neighbour) ; 
            }System.out.println() ; 
        }System.out.print(detectCycle(n , adj));
        detectCycle(n ,adj) ; 
    }
    public static boolean detectCycle(int n , ArrayList<ArrayList<Integer>> adj){
        boolean vis[] = new boolean[n+1] ; 
        for(int i = 0 ; i < n ; i++){
            if(!vis[i]){
                if(dfs( i , n , adj , vis)==true){ ; 
                return true;
                }
            }
        }return false;
    }public static boolean dfs(int start , int n , ArrayList<ArrayList<Integer>> adj , boolean vis[]){
        vis[start] = true ; 
        for(Integer neighbour : adj.get(start)){
            if(!vis[neighbour]){
                if(dfs(neighbour , n , adj ,vis)==true){ ;
                    return true ; 
                }
            }
        }return false ; 
    }

}