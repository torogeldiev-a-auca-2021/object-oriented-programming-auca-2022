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
            for(int j = 0; j < Math.min(c.length,p.length); j++) {
                    res += c[j];
                    res += p[j];
                }
            //method with loop
            for (int j = Math.min(p.length,c.length) ; j < Math.max(p.length, c.length);j++){
                if(c.length > p.length){
                    res += c[j];
                }else {
                    res += p[j];
                }
            }

// method with substring
//            if(c.length > p.length){
//                String a = msg.substring(p.length , c.length);
//                res += a;
//            }
//            if(p.length > c.length){
//                String a = msg1.substring(c.length ,p.length);
//                res += a;
//            }
            System.out.println(res);
        }
    }
}
