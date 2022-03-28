
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String res = "";
        while (true) {
            int counter = 0;
            String msg = sc.nextLine();
            if (msg.equals("0")) {
                break;
            }
            String[] str = msg.split(" ");
            for (int i = 0; i < str.length; i++) {
                System.out.print(str[i].length());
                if (i < str.length - 1) {
                    System.out.print("-");
                    for (int j = 1; j < str.length ; j++) {
                        if(str[i].length() > str[j].length()){
                            res = str[i];
                        }
                    }
                }
            }
        }
        System.out.println();
        System.out.print("The biggest word:" + res);
    }
}