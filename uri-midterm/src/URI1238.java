import java.util.Scanner;

public class URI1238 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cases = sc.nextInt();
        for( int i = 0  ; i < cases ; i++){
            String msg = sc.next();
            String msg1 = sc.next();
            char [] c = msg.toCharArray();
            char [] p = msg1.toCharArray();
            String res ="";
            for(int j = 0; j < c.length; j++) {
                    res += c[j];
                    res += p[j];
                }
            if(c.length > p.length){
                String a = msg.substring(p.length , c.length);
                res += a;
            }
            if(p.length > c.length){
                String a = msg1.substring(c.length ,p.length);
                res += a;
            }
            System.out.println(res);
        }
    }
}
