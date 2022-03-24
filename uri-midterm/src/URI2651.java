import java.util.Locale;
import java.util.Scanner;

public class URI2651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.next().toLowerCase();
        if(msg.contains("zelda")){
            System.out.println("Link Bolado");
        }else{
            System.out.println("Link Tranquilo");
        }
    }
}
