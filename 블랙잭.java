import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] num = new int[n];
        int max = 0;
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++)
            num[i] = Integer.parseInt(st.nextToken());
        for(int i = 0; i < n; i++)
            for(int j = i + 1; j < n; j++)
                for(int k = j + 1; k < n; k++)
                    if(num[i] + num[j] + num[k] <= m && num[i] + num[j] + num[k] >= max)
                        max = num[i] + num[j] + num[k];
        System.out.println(max);
    }
}