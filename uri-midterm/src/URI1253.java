import java.util.Scanner;

public class  URI1253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < line; i++) {
            String mes = sc.next();
            int number = sc.nextInt();
            char p [] = mes.toCharArray();
            for (int j = 0; j < p.length; j++) {
                if((char) (p[j] - number) < 65) {
                    p[j] = (char) (p[j] + 26 - number);
                }else{
                    p[j] = (char) (p[j] - number);
                }
                System.out.print(p[j]);
            }
            System.out.println();
        }
    }
}



