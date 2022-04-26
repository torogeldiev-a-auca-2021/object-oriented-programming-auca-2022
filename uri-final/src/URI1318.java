import java.util.Scanner;

public class URI1318 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n;
        int m;
        while ((n = scn.nextInt()) != 0 && (m = scn.nextInt()) != 0) {
            int b []  = new int[501];
            for (int i = 0; i < m; i++) {
                int num = scn.nextInt();
                b[num]++;
            }
            int res = 0;
            for (int i = 0; i < b.length; i++) {
                if(b[i] >1){
                    res++;
                }
            }
            System.out.println(res);
        }
    }
}