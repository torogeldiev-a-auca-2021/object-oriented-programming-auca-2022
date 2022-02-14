import java.util.Scanner;

public class URI1272 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < number; i++) {
            String str = sc.nextLine();
            showMSG(str);
        }
    }

    static void showMSG(String str) {
        String[] st = str.split(" ");
        for (int j = 0; j < st.length; j++) {
            if (st[j].length() > 1) {
                char c = st[j].charAt(0);
                System.out.print(c);
            } else {
                System.out.print(st[j]);
            }
        }
        System.out.println();



    }
}
