import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(getP(k, n)).append("\n");
        }
        System.out.println(sb);
    }
    private static int getP(int k, int n) {
        int[][] p = new int[k+1][n+1];
        for(int i = 0; i <= k; i++) {
            for(int j = 0; j <= n; j++) {
                if (i == 0)
                    p[i][j] = j;
                else {
                    for(int l = 0; l <= j; l++)
                        p[i][j] += p[i-1][l];
                }
            }
        }
        return p[k][n];
    }
}