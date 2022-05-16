import java.util.Scanner;

public class URI1574 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int x = 0;
            int c = sc.nextInt();
            sc.nextLine();
            int[] cm = new int[c + 1];
            for (int j = 1; j < cm.length; j++) {
                String cmd = sc.nextLine();
                switch (cmd) {
                    case "LEFT":
                        cm[j] = 0;
                        break;
                    case "RIGHT":
                        cm[j] = 1;
                        break;
                    default:
                        String[] a = cmd.split(" ");
                        cm[j] = cm[Integer.parseInt(a[a.length - 1])];
                }
                x = cm[j] == 0 ? --x : ++x;
            }
            System.out.println(x);
        }
    }
}