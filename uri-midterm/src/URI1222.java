import java.util.Scanner;

public class URI1222 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            int n = sc.nextInt();
            String [] a = new String[n];
            int line = sc.nextInt();
            int chars = sc.nextInt();
            int amount = 0;
            int answerLine = 0;
            for (int i = 0; i < a.length; i++){
                a[i] = sc.next();
            }
            for (int i = 0; i < a.length; i++) {
                if (amount + a[i].length() > chars){
                   answerLine++;
                    amount = a[i].length();
                }else {
                    amount += a[i].length();
                    amount += i == n - 1 ? 0 : 1;
                }
            }
            int result = answerLine / line ;
            float resultFloat = answerLine / (line * 1.0f);
            if ((resultFloat - result) > 0){
                result++;
            }
            System.out.println(result);
        }
    }
}
