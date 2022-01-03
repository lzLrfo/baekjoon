import java.io.*;
import java.util.*;
public class Main {
    static int size;
    static int[] que;
    static int front = 0;
    static int rear = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        que = new int[size];
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();
            if(s.equals("push"))
                push(Integer.parseInt(st.nextToken()));
            else if(s.equals("pop"))
                sb.append(pop()).append("\n");
            else if(s.equals("size"))
                sb.append(size()).append("\n");
            else if(s.equals("empty"))
                sb.append(empty()).append("\n");
            else if(s.equals("front"))
                sb.append(front()).append("\n");
            else if(s.equals("back"))
                sb.append(back()).append("\n");
        }
        System.out.println(sb);
    }

    public static void push(int x) {
        que[rear++] = x;
    }

    public static int pop() {
        if(empty() == 1)
            return -1;
        else
            return que[front++];
    }

    public static int size() {
        return (rear - front);
    }

    public static int empty() {
        if(rear - front == 0)
            return 1;
        else
            return 0;
    }

    public static int front() {
        if(empty() == 1)
            return -1;
        else
            return que[front];
    }

    public static int back() {
        if(empty() == 1)
            return -1;
        else
            return que[rear-1];
    }
}