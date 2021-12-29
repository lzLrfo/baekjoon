import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i ++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(checking(n)).append("\n");
        }
        System.out.println(sb);
    }
    public static int checking(int n) {
        boolean[] opened = new boolean[n+1];
        int cnt = 0;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(j % i == 0) {
                    if(opened[j])
                        opened[j] = false;
                    else
                        opened[j] = true;
                }
            }
        }
        for(int i = 1; i <= n; i++)
            if(opened[i])
                cnt++;
        return cnt;
    }
}