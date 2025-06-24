public class BinaryLiftingForLCA {
    private int[][] table;
    private static final int max=17;
    private int[] levels;
    BinaryLiftingForLCA(int len){
        table=new int[max][len];
        levels=new int[len];
    }


    public void build(int[] tree){
        table[0]=tree;
        int n=tree.length;
        for(int i=1 ; i<max ; i++){
            for(int j=0 ; j<n ; j++){
                table[i][j]=table[i-1][table[i-1][j]];
            }
        }
    }

    public void lca(int nodeU,int nodeV){
        
    }
    public void findLevel(){

    }

    
    public static void main(String[] args) {
        
    }    
}
