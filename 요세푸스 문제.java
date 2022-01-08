import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int idx = k - 1;
        LinkedList<Integer> p = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            p.add(i+1);
        }
        sb.append("<");
        while(true) {
            sb.append(p.get(idx));
            p.remove(idx);
            idx += (k - 1);
            while(idx >= p.size()) {
                idx -= p.size();
                if(p.isEmpty())
                    break;
            }
            if(p.isEmpty())
                break;
            else
                sb.append(", ");
        }
        sb.append(">");
        System.out.println(sb);
    }
}