import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int idx = Integer.parseInt(st.nextToken());
            char[] ch = st.nextToken().toCharArray();
            for(int j = 0; j < ch.length; j++) {
                if(j == idx - 1)
                    continue;
                else
                    sb.append(ch[j]);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}