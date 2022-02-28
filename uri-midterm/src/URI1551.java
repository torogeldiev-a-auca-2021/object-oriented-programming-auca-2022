import java.util.Scanner;

public class URI1551 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < num; i++) {
            String msg = sc.nextLine();
            int [] alp = new int[27];
            int counter = 0;
            char [] newMsg = msg.toCharArray();
            for (int j = 0; j < newMsg.length; j++) {
                if (newMsg [j] > 96 && newMsg [j] < 123) {
                    alp[newMsg [j] - 96]++;
                }
            }
            for (int p = 1; p < alp.length; p++) {
                if (alp [p] >= 1)
                    counter++;
            }
            String result = "frase mal elaborada";
            if (counter == 26)
                result = "frase completa";

            else if (counter < 26 && counter >= 13)
                result = "frase quase completa";

            System.out.println(result);
        }

    }
}
