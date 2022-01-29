import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        HashMap<String, Integer> hm = new HashMap<>();
        int max = 0;
        String bestseller = "";
        for(int i = 0; i < n; i++) {
            String book = br.readLine();
            if(!hm.containsKey(book))
                hm.put(book, 0);
            else {
                int cnt = hm.get(book) + 1;
                hm.put(book, cnt);
            }
        }
        for(int i : hm.values()) {
            if(i > max)
                max = i;
        }
        for(String book : hm.keySet()) {
            if(hm.get(book) == max) {
                if(bestseller.isBlank())
                    bestseller = book;
                else {
                    if(book.compareTo(bestseller) < 0)
                        bestseller = book;
                }
            }
        }
        System.out.println(bestseller);
    }
}