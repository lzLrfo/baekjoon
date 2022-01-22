import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true) {
            String s = br.readLine();
            if(s.equals("."))
                break;
            if(isBalance(s))
                sb.append("yes\n");
            else
                sb.append("no\n");
        }
        System.out.println(sb);
    }

    private static boolean isBalance(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[')
                stk.push(s.charAt(i));
            else if(s.charAt(i) == ')') {
                if(!stk.isEmpty() && stk.peek() == '(')
                    stk.pop();
                else
                    return false;
            }
            else if(s.charAt(i) == ']') {
                if(!stk.isEmpty() && stk.peek() == '[')
                    stk.pop();
                else
                    return false;
            }
        }
        if(stk.isEmpty())
            return true;
        else
            return false;
    }
}
