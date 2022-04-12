import java.util.Scanner;

public class URI1087 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            if(x == 0 && y == 0 && x1 == 0 && y1 == 0 ){
                break;
            }
           if(x == x1 && y == y1){
               System.out.println(0);
           }
           if(Math.abs(x) == 3){
               System.out.println(1);
           }
           if(x != x1 && y != y1){
               System.out.println(2);
           }
        }
    }
}
