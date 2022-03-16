import java.util.Arrays;
import java.util.Scanner;

public class URI2174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0,res2= 0;
        int pok = 0;
        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();

        }
        for (int i = 0; i < a.length - 1; i++) {
            Arrays.sort(a);
            if (a[i].equals(a[i] + 1)){
                res = 1;
            }else {
                res2++;
            }
        }
        pok = 151 - res - res2 ;
        System.out.println("Falta(m) " + pok + " pomekon(s).");
    }
}