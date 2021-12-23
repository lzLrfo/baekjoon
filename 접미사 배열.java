import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        ArrayList<String> suffix = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
            suffix.add(s.substring(i));
        Collections.sort(suffix);
        for(int i = 0; i < suffix.size(); i++)
            sb.append(suffix.get(i)).append("\n");
        System.out.println(sb);
    }
}