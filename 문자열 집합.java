import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[] set = new String[n];
        String[] str = new String[m];
        int cnt = 0;
        for(int i = 0; i < n; i++)
            set[i] = br.readLine();
        for(int i = 0; i < m; i++)
            str[i] = br.readLine();
        for(String a : set) {
            for(String b : str) {
                if(a.equals(b))
                    cnt++;
            }
        }
        System.out.println(cnt);
    }
}
