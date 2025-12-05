import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
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