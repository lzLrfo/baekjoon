import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int days;
        int cnt = 1;
        int l, p, v;
        while(true) {
            days = 0;
            st = new StringTokenizer(br.readLine(), " ");
            l = Integer.parseInt(st.nextToken());
            p = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            if(l == 0 && p == 0 && v == 0)
                break;
            if(v % p < l)
                days = (v % p) + l * (v / p);
            else
                days = l + l * (v / p);
            sb.append("Case " + cnt++ + ": " + days + "\n");
        }
        System.out.println(sb);
    }
}