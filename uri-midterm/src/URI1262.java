import java.util.Scanner;

public class URI1262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String msg = sc.next();
            int a = sc.nextInt();
            int res = 0;
            char[] s = msg.toCharArray();
            for (int i = 0; i < s.length; i++) {
                if (s[i] == 'W') {
                    res++;
                }
                if (s[i] == 'R') {
                    int counter = 0;
                    while (s[i] == 'R') {
                        if (i == msg.length() - 1) {
                            res++;
                            break;
                        }
                        counter++;
                        if (counter == a) {
                            res++;
                            break;
                        }
                        i++;
                    }
                    if (s[i] == 'W') {
                        res+=2;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
