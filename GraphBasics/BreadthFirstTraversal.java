import java.util.* ; 
class BreadthFirstTraversal{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in) ; 
        int n = 7 ; 
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>() ; 
        for(int i = 0 ; i < n+1 ; i++){
            adjList.add(new ArrayList<>()) ;

        }
        adjList.get(1).add(2) ; 
        adjList.get(1).add(3) ; 
        adjList.get(2).add(4) ; 
        adjList.get(2).add(5) ; 
        adjList.get(3).add(6) ; 
        adjList.get(3).add(7) ;
        for(int i =0 ;i<adjList.size() ; i++){
            System.out.print(i + "->");
            for(Integer x : adjList.get(i)){
                System.out.print(x+" ");
            }System.out.println() ; 
        }

        ArrayList<Integer> bfs = new ArrayList<>() ; 
        boolean vis[] = new boolean[n+1] ; 
        Queue<Integer> que = new LinkedList<>() ; 
        int starting = sc.nextInt() ;
        vis[starting] = true ; 
        que.add(starting) ;
        
        while(!que.isEmpty()){
            int x = que.poll() ;
            bfs.add(x) ; 
            for( Integer x1 : adjList.get(x)){
                if(!vis[x1]){
                    que.add(x1) ; 
                    vis[x1] = true ; 
                }
            }
        }for( Integer i : bfs){
            System.out.print(i+" ");
        } 
        
    
    }
}