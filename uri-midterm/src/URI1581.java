import java.util.Scanner;

public class URI1581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        for (int i = 0; i < line; i++) {
            int amount = sc.nextInt();
            String lan = sc.next();
            for (int j = 1; j < amount; j++) {
                if(!sc.next().equals(lan)) {
                    lan = "ingles";
                }
            }
            System.out.println(lan);
        }
    }
}