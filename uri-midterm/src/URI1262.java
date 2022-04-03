import java.util.Scanner;

public class URI1262 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()){
            String msg = sc.next();
            int a = sc.nextInt();
            int w = 0, r = 0,counter = 0, sum = 0;
            char  [] s = msg.toCharArray();
            for (int i = 0; i < s.length; i++) {
                if(s[i]== 'W'){
                    w++;
                }
                if(s[i] == 'R'){
                    while (s[i] == 'R'){
                        counter++;
                        if(counter == a){
                            r++;
                            break;
                        }
                        i++;
                    }
                }

            }

            sum = w + r;
            System.out.println(sum);
        }
    }
}
