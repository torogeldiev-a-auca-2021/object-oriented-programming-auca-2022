import java.util.Scanner;

public class URI1120 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next();
        String message = sc.next();
        String res = "";
        char[] a = msg.toCharArray();
        char[] b = message.toCharArray();
        for (int i = 0 ; i < a.length; i++){
            for(int j = 0; j < b.length; j++){
                if(a[i] == b[j]){
                    String aa = message.replace(a[i] ,' ');
                    res = b[j] + aa;
                }

            }
        }
        System.out.print(res);
    }
}
