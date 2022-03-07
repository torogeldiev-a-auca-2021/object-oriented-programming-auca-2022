import java.util.Scanner;

public class URI1273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        while (lines > 0) {
            String names[] = new String[lines + 1];
            names[0] = "";
            for (int i = 1; i < lines + 1; i++) {
                names[i] = sc.next();
            }
            for (int j = 0; j < names.length; j++) {
                if (names[j].length() > names[0].length()) {
                    names[0] = names[j];
                }
            }
            for (int j = 1; j < names.length; j++) {
                for (int i = 0; i < names[0].length() - names[j].length(); i++) {
                    System.out.print(" ");
                }
                System.out.println(names[j]);
            }
            lines = sc.nextInt();
            if (lines == 0)
                break;
            else
                System.out.println();
        }
    }
}