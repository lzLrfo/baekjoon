import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Croatian {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        String s = br.readLine();
        String[] cro = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int answer = 0;
        for(String c : cro) {
            if(s.contains(c)) {  
                s = s.replace(c, "0");
            } // ex) ljes=njak -> 0e00ak , c=c= -> 00
        }
        answer += s.length();
        System.out.println(answer);
    }
}