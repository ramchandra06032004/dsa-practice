import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Codechef {
    static FastIO sc = new FastIO();

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            s();
        }
        sc.out.flush();
    }

    public static void s() {
        long totalBase = sc.nextLong();
        long days = sc.nextLong();
        long baseCamp = sc.nextLong();

        long low = 1;
        long high = totalBase;
        long ans = low;

        while (low <= high) {
            long mid = low + (high - low) / 2;
            boolean temp = check(totalBase, days, baseCamp, mid);
            if (temp) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        sc.println(ans);
    }

    public static boolean check(long totalBase, long days, long baseCamp, long target) {
        long onLeft = baseCamp - 1;
        long onRight = totalBase - baseCamp;
        long min = Long.MAX_VALUE;
        for (long i = Math.min(target - 1, onLeft); i >= 0; i--) {
            long currOnRight = target - (i + 1);
            if (currOnRight > onRight) {
                continue;
            }
            long reqDays = (i - 1) + Math.max(currOnRight, i) + currOnRight;
            min = Math.min(min, reqDays);
            //sc.println("Left: " + i + " Right: " + currOnRight + " Days: " + reqDays+"  target: "+target+"  min: "+min);
        }
        return min <= days;
    }
}

class FastIO {
    BufferedReader br;
    StringTokenizer st;
    PrintWriter out;

    public FastIO() {
        br = new BufferedReader(new InputStreamReader(System.in));
        out = new PrintWriter(System.out);
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }

    void print(Object o) {
        out.print(o);
    }

    void println(Object o) {
        out.println(o);
    }
}