import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] result = new String[n];
        int[] score = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            result[i] = scan.next();
            score[i] = 0;
        }
        
        for(int i = 0; i < n; i++) {
            count = 0;
            for(int j = 0; j < result[i].length(); j++) {
                if(result[i].charAt(j) == 'O') {
                    count++;
                    score[i] += count;
                }
                else
                    count = 0;
            }
        }
        
        for(int i = 0; i < n; i++)
            System.out.println(score[i]);
    }
}