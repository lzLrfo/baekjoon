import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] xy = new int[n][2];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            xy[i][0] = Integer.parseInt(st.nextToken());
            xy[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(xy, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0])
                    return o1[1] - o2[1];
                else
                    return o1[0] - o2[0];
            }
        });
        for(int i = 0; i < n; i++)
            sb.append(xy[i][0]).append(" ").append(xy[i][1]).append("\n");
        System.out.println(sb);
    }
}