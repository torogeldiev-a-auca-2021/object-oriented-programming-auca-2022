import java.util.Scanner;

public class URI1241 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        String res = "";

        for (int i = 0; i < lines; i++) {
            String msg = sc.next();
            String message = sc.next();
            char[] a = msg.toCharArray();
            char[] b = message.toCharArray();
            for (int j = 0; j < a.length; j++) {
                for (int p = 0; p < b.length; p++) {
                    if (a.length > b.length) {
                        String r = msg.substring(a.length - b.length, a.length);
                        if (r.equals(message)) {
                            res = "encaixa";
                        } else {
                            res = "nao encaixa";
                        }
                    }
                }
                if(b.length > a.length){
                    String t = message.substring(b.length - a.length, b.length);
                    if (t.equals(message)) {
                        res = "encaixa";
                    } else {
                        res = "nao encaixa";
                    }

                }
                if(a.length == b.length){
                    if(msg.equals(message)){
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






