import java.util.Scanner;

public class URI1258 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int l = sc.nextInt();
        int alp,pos,elem;
        int hash = 0;
        for(int i = 0 ; i < n ;i++){
            for (int j = 0; j < l; l++ ){
                String msg = sc.nextLine();
                char []a = msg.toCharArray();
                for(int p = 0; p < msg.length();p++){
                alp = a[p] - 65;
                elem = j;
                pos = a[p];
                hash += alp + elem + pos;

                }
                System.out.println(hash);
            }
        }
    }
}
