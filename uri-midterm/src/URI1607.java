import java.util.Scanner;

public class URI1607 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i< n; i++){
            String msg = sc.next();
            String msg1 = sc.next();

            int ans = 0;
            for (int j = 0; j < msg.length(); j++) {
                char a = msg.charAt(j);
                char b = msg1.charAt(j);

                while (a != b) {
                    if(a == 'z'){
                        a = 'a';
                    } else {
                        a++;
                    }
                    ans ++;
                }
            }

            System.out.println(ans);
        }
    }
}
