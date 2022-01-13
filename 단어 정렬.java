import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] words = new String[n];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) 
            words[i] = br.readLine();
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length())
                    return o1.compareTo(o2);
                else
                    return o1.length() - o2.length();
            }
        });
        sb.append(words[0]).append("\n");
        for(int i = 1; i < n; i++)
            if(!words[i].equals(words[i-1]))
                sb.append(words[i]).append("\n");
        System.out.println(sb);
    }
}