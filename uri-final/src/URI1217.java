import java.util.Scanner;

public class URI1217 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double res = 0;
        double kg = 0, money = 0;
        for (int i = 1; i <= n; i++) {
            int counter = 1;
            double m = sc.nextDouble();
            sc.nextLine();
            String msg = sc.nextLine();
            for (int j = 0; j < msg.length(); j++) {
                if(msg.charAt(j) == ' '){
                    counter++;
                }
            }
            res = msg.split(" ").length;
            kg += res / n;
            money += m / n;
            System.out.println("day " + i + ":" + " " + counter + " kg");
        }
        System.out.printf("%.2f kg by day\n" , kg);
        System.out.printf("R$ %.2f by day" , money);
        System.out.println();
    }
}
