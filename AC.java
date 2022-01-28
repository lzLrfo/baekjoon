import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            String ins = br.readLine();
            int n = Integer.parseInt(br.readLine());
            int[] x = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");
            for(int j = 0; j < n; j++)
                x[j] = Integer.parseInt(st.nextToken());
            sb.append(doRD(ins, n, x)).append("\n");
        }
        System.out.println(sb);
    }
    private static String doRD(String s, int a, int[] arr) {
        String answer = "";
        int head = 0, tail = a - 1;
        int tmp = 0;
        boolean reverse = false;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R') {
                tmp = head;
                head = tail;
                tail = tmp;
                reverse = !reverse;
            }
            else {
                a--;
                if(a < 0)
                    return "error";
                if(reverse)
                    head--;
                else
                    head++;
            }
        }
        if(a == 0)
            return "[]";
        if(reverse) {
            for(int i = head; i >= tail; i--) {
                if(i == head)
                    answer += "[" + Integer.toString(arr[i]) + ",";
                else if(i == tail)
                    answer += Integer.toString(arr[i]) + "]";
                else
                    answer += Integer.toString(arr[i]) + ",";
            }
        }
        else {
            for(int i = head; i <= tail; i++) {
                if(i == head)
                    answer += "[" + Integer.toString(arr[i]) + ",";
                else if(i == tail)
                    answer += Integer.toString(arr[i]) + "]";
                else
                    answer += Integer.toString(arr[i]) + ",";
            }
        }
        return answer;
    }
}