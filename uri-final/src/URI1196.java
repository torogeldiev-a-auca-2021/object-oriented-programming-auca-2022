
import java.util.Scanner;

public class URI1196 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String msg = sc.nextLine();
            char[] key = {'`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '=', 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O',
                    'P', '[', ']', '\\', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', ';','\'', 'Z', 'X'
                    , 'C', 'V', 'B', 'N', 'M', ',', '.', '/'};
            char[] b = msg.toCharArray();
            for (int i = 0; i < msg.length(); i++) {
                if (!Character.isWhitespace(b[i])) {
                    for (int j = 0; j < key.length; j++) {
                        if (b[i] == key[j]) {
                            b[i] = key[j - 1];
                            System.out.print(b[i]);
                            break;
                        }
                    }
                } else {
                    System.out.print(" ");
                }
                if(i == msg.length()- 1){
                    System.out.println();
                }
            }
        }
    }
}
