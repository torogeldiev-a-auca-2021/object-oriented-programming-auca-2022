import java.util.Scanner;

public class URI1208 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        while (true) {
            String msg = sc.nextLine();
            int number = msg.codePointCount(0,msg.length());
            if (msg.equals("0")) {
                break;
            }
            String[] str = msg.split(" ");
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i].length());
                if (i < str.length - 1) {
                    System.out.print("-");
                }
                if(str[i].length() >= res.length()){
                    String ss = new String(str[i]);
                    res = ss;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("The biggest word: " + res);
        System.out.println();
    }
}