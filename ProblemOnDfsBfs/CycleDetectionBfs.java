import java.util.* ;
class Pair{
    int node ;
    int parent ;

    Pair(int node , int parent) {
        this.node = node ;
        this.parent = parent ; 

    }
} 
class CycleDetectionBfs{
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
        }
    public static boolean detectCycle(int n , ArrayList<ArrayList<Integer>> adj){
        
        boolean vis[] = new boolean[n+1]; 
        for(int i = 0 ; i < n+1 ; i++){
            if(!vis[i]){
                if(cycleExist(i , n , adj , vis)) {
                return true ; 
            }
            }
        }return false ; 
    } 
    public static boolean cycleExist(int start , int n , ArrayList<ArrayList<Integer>> adj , boolean[] vis){
        vis[start] = true ; 
        Queue<Pair> q = new LinkedList<>() ; 
        q.offer(new Pair(start , -1)) ; 

        while(!q.isEmpty()){
            Pair cur = q.poll() ; 
            int node = cur.node ; 
            int parent = cur.parent ; 
            
            for(Integer neighbour : adj.get(node)){
                if(!vis[neighbour]){
                    vis[neighbour]= true ;
                    q.offer(new Pair(neighbour , node)) ; 

                }else if(parent!=neighbour){
                        return true ; 
                    
                }
            }
        }return false ; 

    }

}