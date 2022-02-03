import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int zero;
    static int one;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            zero = 0;
            one = 0;
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            sb.append(zero).append(" ").append(one).append("\n");
        }
        System.out.println(sb);
    }
    static int fibonacci(int n) {
        if (n == 0) {
            zero++;
            return 0;
        } else if (n == 1) {
            one++;
            return 1;
        } else {
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}