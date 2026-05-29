import java.util.* ; 
class DepthFirstTraversal{
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in) ;
        int n = 7 ;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>() ; 
        for(int i = 0 ; i <=n ; i++){
            adj.add(new ArrayList<>()) ; 

        } 
        adj.get(1).add(2); 
        adj.get(1).add(3); 
        adj.get(2).add(4); 
        adj.get(2).add(5); 
        adj.get(3).add(6); 
        adj.get(3).add(7);

        for(int i = 0 ; i < adj.size() ; i++){
            System.out.print(i + "->") ;
            for( Integer x : adj.get(i)){
                System.out.print(x + " ");
            }System.out.println() ;
        }
        boolean vis[] = new boolean[n+1] ;
        dfs(1 , adj , vis);
        

    }public static void dfs(int node , ArrayList<ArrayList<Integer>> adj ,boolean vis[] ){
        vis[node]= true ; 
        System.out.print(node + " ") ;
        for( Integer x : adj.get(node)){
            if(!vis[x]){
                dfs(x , adj , vis) ; 
            }
        }
    }
}