
import java.util.Scanner;

public class URI2062 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] msg = new String[n];
        for (int i = 0; i < n; i++) {
            boolean obi = false, uri = false, inp = false;
            msg[i] = sc.next();
            char [] b = msg[i].toCharArray();
            for (int j = 0; j < msg[i].length(); j++) {
                if(msg[i].length() == 3 && b[0] == 'O' && b[1] == 'B'){
                    obi = true;
                }else if(msg[i].length() == 3 && b[0] == 'U' && b[1] == 'R'){
                    uri = true;
                }
                else{
                    inp = true;
                }
            }
            if(obi)
                System.out.print("OBI");
            if(uri)
                System.out.print("URI");
            if(inp)
                System.out.print(msg[i]);
            if(i < msg.length - 1){
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}