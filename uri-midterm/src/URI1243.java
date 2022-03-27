import java.util.Scanner;

public class URI1243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0, word = 0,res = 0;
        while(sc.hasNextLine()){
            String msg = sc.nextLine();
            n = msg.codePointCount(0 , msg.length());
            String[] str = msg.split(" ");
            word = str.length;
            for (int i = 0; i < msg.length(); i++) {
                if(msg.charAt(i) == ' ' || Character.isDigit(msg.charAt(i)) || msg.charAt(i) == '.'){
                    n--;
                }
            }
            res = n / word;
            if(res <= 3)
            System.out.println("250");
            else if(res == 4 || res == 5)
                System.out.println("500");
            else
                System.out.println("1000");
        }
    }
}
