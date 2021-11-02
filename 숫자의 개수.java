import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        String answer = Integer.toString(a*b*c);
        int[] num = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0 ; i < answer.length(); i++) {
            if(answer.charAt(i) == '0')
                num[0]++;
            else if(answer.charAt(i) == '1')
                num[1]++;
            else if(answer.charAt(i) == '2')
                num[2]++;
            else if(answer.charAt(i) == '3')
                num[3]++;
            else if(answer.charAt(i) == '4')
                num[4]++;
            else if(answer.charAt(i) == '5')
                num[5]++;
            else if(answer.charAt(i) == '6')
                num[6]++;
            else if(answer.charAt(i) == '7')
                num[7]++;
            else if(answer.charAt(i) == '8')
                num[8]++;
            else
                num[9]++;
        }
        for(int i = 0; i < 10; i++)
            System.out.println(num[i]);
        
    }
}