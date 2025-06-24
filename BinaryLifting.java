public class BinaryLifting {
    private static int max=18;
    int[][] table;
    BinaryLifting(int len){
        table=new int[max][len];
    }   

    public void build(int[] tree){
        int n=tree.length;
        for(int i=0 ; i<n ; i++){
            table[0][i]=tree[i];
        }

        for(int i=1 ; i<max ; i++){
            for(int j=0 ; j<n ; j++){
                table[i][j]=table[i-1][table[i-1][j]];
            }
        }
    }
    public int query(int node,int k){

        for(int i=0 ; i<max ; i++){
            int mask=(1<<i);
            if ((k&mask)>0) {
                node=table[i][node];
            }
        }
        return node;
    }

}
class Main{
    public static void main(String[] args) {
        
    }
}
