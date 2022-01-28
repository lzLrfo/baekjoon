import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char[] cap = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] small = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            int alph = s.charAt(i);
            if(alph >= 'A' && alph <= 'Z') {
                alph = (alph - 'A' + 13) % 26;
                sb.append(cap[alph]);
            }
            else if(alph >= 'a' && alph <= 'z') {
                alph = (alph - 'a' + 13) % 26;
                sb.append(small[alph]);
            }
            else
                sb.append(s.charAt(i));
        }
        System.out.println(sb);
    }
}