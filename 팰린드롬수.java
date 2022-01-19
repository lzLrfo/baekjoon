import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String s = br.readLine();
            if(s.equals("0"))
                break;
            int cnt = 0;
            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != s.charAt(s.length() - i - 1))
                    break;
                else
                    cnt++;
            }
            if(cnt == s.length())
                sb.append("yes\n");
            else
                sb.append("no\n");
        }
        System.out.println(sb);
    }
}