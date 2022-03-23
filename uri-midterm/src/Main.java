import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        StringBuilder msg = new StringBuilder();
        for (int i = 0; i < n; i++) {
           String mes = sc.nextLine();
           char  [] a = mes.toCharArray();
            for (int j = 0; j < mes.length(); j++) {
                if(a[j] >= 65 && a[j] <= 90 || a[j] >= 97 && a[j] <= 122) {
                    a[j] += 3;
                    msg.append(a[j]);
                    msg.reverse();
                }
            }
        }
        System.out.println(msg);
    }
}
