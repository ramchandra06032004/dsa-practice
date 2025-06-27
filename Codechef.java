
import java.util.Scanner;

class Codechef {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t>0){
            t--;
            solve();
        }
    }

    public static void solve() {
        int n=sc.nextInt();
        int[] arr=new int[n];
        int[] prifixSum=new int[n];
        for(int i=0 ; i<n ; i++){
            arr[i]=sc.nextInt();
            prifixSum[i]=((i==0?0:prifixSum[i-1])+arr[i])%3;
        }
        
        int p=n-1;
        while (p>=0) { 
            if(prifixSum[p]==0){
                break;
            }
            p--;
        }
        if(p==-1){
            System.out.println("Yes");
            return;
        }
        int lastZero=p;
        
        boolean foundOne=false;
        boolean foundTwo=false;

        while(p>=0){
            if(prifixSum[p]==1){
                foundOne=true;
            }
            else if(prifixSum[p]==2){
                foundTwo=true;
            }
            p--;
        }
        while(lastZero<n){
            if(prifixSum[lastZero]==1 && !foundOne){
                System.out.println("Yes");
                return;
            }else if(prifixSum[lastZero]==2 && !foundTwo){
            //System.out.println(foundOne+"           "+foundTwo);
                System.out.println("Yes");
                return;
            }
            lastZero++;
        }
        System.out.println("No");


    }
}
