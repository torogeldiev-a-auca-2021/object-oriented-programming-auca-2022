import java.util.Scanner;

public class URI2694 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String msg = sc.next();
            String[] numbers = msg.split("[a-zA-Z]");
            int sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                try {
                    sum += Integer.parseInt(numbers[j]);
                } catch (Exception e){
                    //
                }
            }
            System.out.println(sum);
        }
    }
}