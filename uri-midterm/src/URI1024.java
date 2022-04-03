import java.util.Scanner;

public class URI1024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String msg = sc.nextLine();
            char []a = msg.toCharArray();
            String res = "";
            for (int j = msg.length() -1 ; j >= 0; j--) {
                if (Character.isLetter(a[j])) {
                    a[j] += 3;
                }
                if(a[j] >= 91 &&  a[j] < 96 || a[j] < 65 || a[j] > 122){
                    a[j] += 3 - 28;
                }
                res += a[j];
            }
            System.out.println(res);
            char [] b = res.toCharArray();
                for (int j = (res.length() / 2); j < res.length() ; j++) {
                    b[j] -= 1;
                }
            System.out.println(res);
        }
    }
}
