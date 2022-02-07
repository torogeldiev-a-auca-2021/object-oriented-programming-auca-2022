import java.util.Scanner;

public class URI1241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        String res ="";

        for ( int i = 0; i < lines; i++){
            String msg = sc.next();
            String message = sc.next();
            for (int j = 0; j < msg.length(); j++){
                for(int p = 0; p < message.length();p++){
                    char a = msg.charAt(msg.length() - 1);
                    char b = message.charAt(message.length() - 1);
                    if(a == b){
                        res = "encaixa";

                    }else{
                        res = "nao encaixa";


                    }
                }
            }
            System.out.println(res);
            }
    }
}
