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
        int[] zero = new int[41];
        int[] one = new int[41];
        zero[0] = 1; zero[1] = 0;
        one[0] = 0; one[1] = 1;
        for(int i = 2; i < 41; i++) {
            zero[i] = zero[i-1] + zero[i-2];
            one[i] = one[i-1] + one[i-2];
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            sb.append(zero[n[i]]).append(" ").append(one[n[i]]).append("\n");
        }
        System.out.println(sb);
    }
}