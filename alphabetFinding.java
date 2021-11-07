import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int[] index = new int[26];
        for(int i = 0; i < 26; i++) {
            index[i] = -1;
        }
        for(int i = 0; i < s.length(); i++) {
            if(index[(int)s.charAt(i) - 97] == -1)
                index[(int)s.charAt(i) - 97] = i;
        }
        
        for(int i = 0; i < 26; i++)
            System.out.print(index[i] + " ");
    }
}