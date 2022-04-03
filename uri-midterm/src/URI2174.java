import java.util.Arrays;
import java.util.Scanner;

public class URI2174 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int pok = 0;

        String[] a = new String[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.next();
        }
        int res = 0;
        Arrays.sort(a);
        for (int i = 0; i < a.length ; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].equals(a[j])) {
                    res++;
                    break;
                }
            }

        }
        pok = 151 - n + res;
        System.out.println("Falta(m) " + pok + " pomekon(s).");
    }
}