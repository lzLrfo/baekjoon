import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < t; i++) {
            String s = br.readLine();
            Stack<Character> st = new Stack<>();
            for(int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '(')
                    st.push('(');
                else if(s.charAt(j) == ')')
                    if(st.empty())
                        st.push(')');
                    else
                        if(st.peek() == '(')
                            st.pop();
                }
            if(st.empty())
                sb.append(("YES\n"));
            else
                sb.append("NO\n");
        }
        System.out.println(sb);
    }
}