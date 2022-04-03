import java.util.Scanner;

public class URI2694 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String msg = sc.next();
            char[] a = msg.toCharArray();
            int res1 = 0, res2 = 0, res3 = 0;
            int answer = 0;
            for (int j = msg.length(); j > 0; j++) {
                if(Character.isDigit(a[j])){
                    String res = "";
                    while (Character.isDigit(a[j])){
                            res+= a[j];
                            j++;
                            }
                    answer += Integer.parseInt(res);
                    }
                }
            }
        }
    }