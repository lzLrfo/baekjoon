import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();
            if(s.equals("push"))
                stack.push(Integer.parseInt(st.nextToken()));
            else if(s.equals("pop")) {
                if(stack.empty())
                    sb.append("-1\n");
                else {
                    sb.append(stack.peek()).append("\n");
                    stack.pop();
                }
            }
            else if(s.equals("size"))
                sb.append(stack.size()).append("\n");
            else if(s.equals("empty")) {
                if(stack.empty())
                    sb.append("1\n");
                else
                    sb.append("0\n");
            }
            else if(s.equals("top")) {
                if(stack.empty())
                    sb.append("-1\n");
                else
                    sb.append(stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}