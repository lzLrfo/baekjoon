import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] n = new int[t];
        for(int i = 0; i < t; i++)
            n[i] = Integer.parseInt(br.readLine());
        int[] dp = new int[11];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 4;
        for(int i = 3; i < 11; i++)
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            sb.append(dp[n[i]-1]).append("\n");
        }
        System.out.println(sb);
    }
}