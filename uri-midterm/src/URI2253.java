import java.util.Scanner;

public class URI2253 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String msg = sc.nextLine();
            char[] a = msg.toCharArray();
            boolean isup = false, islow = false, isdig = false;
            for (int i = 0; i < msg.length(); i++) {
                if (Character.isUpperCase(a[i])) {
                    isup = true;
                } else if (Character.isLowerCase(a[i])) {
                    islow = true;
                } else if (Character.isDigit(a[i])) {
                    isdig = true;
                } else {
                    isup = false;
                    break;
                }

            }
            if (isup && islow && isdig && msg.length() >= 6 && msg.length() <= 32) {
                System.out.println("Senha valida.");
            } else {
                System.out.println("Senha invalida.");

            }
        }
    }
}
