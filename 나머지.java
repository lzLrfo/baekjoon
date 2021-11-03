import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        for(int i = 0; i < 10; i++) {
            int a = scan.nextInt();
            a %= 42;
            if(!num.contains(a))
                num.add(a);
        }
        System.out.println(num.size());
    }
}