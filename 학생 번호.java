import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] studentID = new String[n];
        for(int i = 0; i < n; i++) {
            studentID[i] = br.readLine();
        }
        HashSet<String> set = new HashSet<>();
        int k = 0;
        while(true) {
            for(String id : studentID) {
                id = id.substring(id.length() - 1 - k);
                if(!set.contains(id)) {
                    set.add(id);
                }
                else
                    break;
            }
            if(set.size() == n)
                break;
            else {
                k++;
                set.clear();
            }
        }
        System.out.println(k+1);
    }
}