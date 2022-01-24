import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            String ins = br.readLine();
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");
            int[] nums = new int[n];
            for(int j = 0; j < n; j++)
                nums[j] = Integer.parseInt(st.nextToken());
            sb.append(getAC(ins, n, nums)).append("\n");
        }
        System.out.println(sb);
    }
    private static StringBuilder getAC(String s, int n, int[] arr) {
        StringBuilder sb = new StringBuilder();
        int f = 0, l = n - 1;
        int tmp = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'D') {
                if(--n < 0)
                    return sb.append("error");
                if(f > l)
                    f--;
                else if(f < l)
                    f++;
            }
            else if(s.charAt(i) == 'R') {
                tmp = f;
                f = l;
                l = tmp;
            }
        }
        if(n <= 0)
            return sb.append("[]");
        if(f > l) {
            for(int i = f; i >= l; i--) {
                if(i == f)
                    sb.append("[").append(arr[i]).append(",");
                else if(i == l)
                    sb.append(arr[i]).append("]");
                else
                    sb.append(arr[i]).append(",");
            }
        }
        else if(f < l) {
            for(int i = f; i <= l; i++) {
                if(i == f)
                    sb.append("[").append(arr[i]).append(",");
                else if(i == l)
                    sb.append(arr[i]).append("]");
                else
                    sb.append(arr[i]).append(",");
            }
        }
        return sb;
    }
}