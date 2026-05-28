import java.util.* ; 

//for weighted Graph ; 
class Pair{
    int node ; 
    int wgt ; 
    Pair(int node , int wgt){
        this.node = node ;
        this.wgt = wgt ;
    }
     @Override
    public String toString() {
        return "(" + node + "," + weight + ")";
    }
}
class GraphRepresentation{
    
    public static void main(String[] args){
        // by adjacency matrix 
        
        Scanner sc = new Scanner(System.in)  ;
        // int n = sc.nextInt() ; 
        
        // int[][] adj = new int[n+1][n+1] ;
        // adj[1][2] = 1 ; 
        // adj[2][1] = 1 ; 
        // System.out.print("worked");
        // for(int i = 0 ; i <n+1 ; i++){
        //     for( int j = 0 ; j<n+1 ; j++){
        //         System.out.print(adj[i][j]+ " ");
        //     }
        // }

        // by list 
        // ArrayList<ArrayList<Integer>> st = new ArrayList<>() ; 
        // int nodes = sc.nextInt() ; 
        
        // for(int i = 0 ; i <= nodes ; i++){
        //     st.add(new ArrayList<>()) ;
        // }

        // 1--2 ; 
        // st.get(1).add(2) ; 
        // st.get(2).add(1) ; 
        // st.get(1).add(3) ; 
        // st.get(2).add(0) ; 
        // st.get(2).add(3) ; 
        // st.get(2).add(2) ; 
        // st.get(0).add(1) ; 
        // System.out.print("working");
        // for(int i = 0 ; i <st.size() ; i++){
        //     System.out.print(i + " => ");
        
            // for(int j= 0 ; j<st.get(i).size() ;j++){
            //     System.out.print(st.get(i).get(j)+" ") ; 
            // }System.out.println();

        //     for(Integer x : st.get(i) ){
        //         System.out.print(x); 
        //     }System.out.println();
        // }

        ArrayList<ArrayList<Pair>> wgtgraph = new ArrayList<>() ; 

        int numberOfNodes = sc.nextInt() ; 

        for(int i = 0 ; i<numberOfNodes ; i++){
            wgtgraph.add(new ArrayList<Pair>()) ;
        }        
        wgtgraph.get(1).add(new Pair(1,5)) ; 
        wgtgraph.get(2).add(new Pair(1,5)) ; 
        wgtgraph.get(1).add(new Pair(3,2)) ; 
        wgtgraph.get(2).add(new Pair(3,3)) ; 
        wgtgraph.get(1).add(new Pair(0,5)) ; 
        for( int i = 0 ; i< wgtgraph.size();i++) {
            System.out.print(i +"=>") ;
            for(int j = 0 ; j<wgtgraph.get(i).size() ; j++){
                System.out.print(wgtgraph.get(i).get(j)); 
            } System.out.println();
        }
    }
}
