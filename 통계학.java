import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int[] num = new int[n];
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++)
            num[i] = Integer.parseInt(bf.readLine());
        sb.append(getAvg(num)).append("\n");
        sb.append(getMed(num)).append("\n");
        sb.append(getMode(num)).append("\n");
        sb.append(getRng(num)).append("\n");
        System.out.println(sb);
    }
    private static int getAvg(int[] arr) {
        double avg = 0;
        for(int n : arr)
            avg += n;
        avg /= arr.length;
        if(avg < 0)
            return (int) Math.round(Math.abs(avg) * -1);
        else
            return (int) Math.round(avg);
    }
    private static int getMed(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
    private static int getMode(int[] arr) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> modes = new ArrayList<>();
        for(int n : arr) {
            if(!map.containsKey(n))
                map.put(n, 0);
            else {
                int cnt = map.get(n) + 1;
                map.put(n, cnt);
            }
        }
        for(int fre : map.values()) {
            if(fre >= max)
                max = fre;
        }
        for(int key : map.keySet()) {
            if(map.get(key) == max)
                modes.add(key);
        }
        if(modes.size() == 1)
            return modes.get(0);
        else {
            Collections.sort(modes);
            return modes.get(1);
        }
    }
    private static int getRng(int[] arr) {
        return arr[arr.length-1] - arr[0];
    }
}