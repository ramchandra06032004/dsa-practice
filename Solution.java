import java.util.Arrays;

class SparceTableForMin{
    int[][] table;
    int k;
    SparceTableForMin(int length){
        k=(int)(Math.log(length)/Math.log(2));
        table=new int[k+1][length];
    } 

    public void build(int[] arr){
        table[0]=arr;
        for(int i=1 ; i<k+1 ; i++){
            for(int j=0 ; j+(1<<i)<=arr.length ; j++){
                table[i][j]=Math.min(table[i-1][j],table[i-1][j+(1<<(i-1))]);
            }
        }
    }

    public int query(int left,int right){
        int len=right-left+1;
        int k2=k=(int)(Math.log(len)/Math.log(2));
        return Math.min(table[k2][left],table[k2][right-(1<<k2)+1]);
    }
}
public class Solution {

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 7, 9, 11, 5};
        SparceTableForMin sparseTable = new SparceTableForMin(arr.length);
        sparseTable.build(arr);
        
        System.out.println(sparseTable.query(0, 3));
        System.out.println(sparseTable.query(2, 5)); 
        System.out.println(sparseTable.query(4, 6));  
    }
}