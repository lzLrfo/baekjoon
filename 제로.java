import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int[] stk = new int[k];
        int top = -1;
        int sum = 0;
        for(int i = 0; i < k; i++) {
            int a = Integer.parseInt(br.readLine());
            if(a != 0)
                stk[++top] = a;
            else
                stk[top--] = 0;
        }
        for(int i = 0; i < k; i++)
            sum += stk[i];
        System.out.println(sum);
    }
}