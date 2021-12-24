import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        LinkedHashSet<String> hs = new LinkedHashSet<>();
        String studentID;
        for(int i = 0; i < l; i++) {
            studentID = br.readLine();
            hs.remove(studentID);
            hs.add(studentID);
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = hs.iterator();
        for(int i = 0; i < k; i++) {
            if(it.hasNext())
                sb.append(it.next()).append("\n");
            else break;
        }

        System.out.println(sb);
    }
}