import java.util.Scanner;

public class URI1300 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a % 6 == 0){
                System.out.println("Y");
            }else{
                System.out.println("N");
            }
        }
    }
}