import java.util.Scanner;

public class URI2866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int length = 0;
            StringBuilder mes = new StringBuilder();
            String msg = sc.next();
            length = msg.length() - 1;
            char [] a = msg.toCharArray();
            for (int j = length; j >= 0; j--) {
                if(Character.isLowerCase(a[j])){
                    mes.append(a[j]);
                }
            }
            System.out.println(mes);
        }
    }
}