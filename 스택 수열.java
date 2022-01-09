import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for(int i = 0; i < n; i++)
            nums[i] = Integer.parseInt(br.readLine());
        int num = 1;
        int idx = 0;
        Stack<Integer> stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        while(true) {
            if(stk.isEmpty() || stk.peek() != nums[idx]) {
                stk.push(num++);
                sb.append("+\n");
            }
            else {
                stk.pop();
                sb.append("-\n");
                idx++;
            }
            if(idx == n || num > n + 1)
                break;
        }
        if(stk.isEmpty())
            System.out.println(sb);
        else
            System.out.println("NO");
    }
}