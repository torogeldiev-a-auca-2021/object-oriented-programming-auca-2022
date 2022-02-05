import java.util.Scanner;

public class URI1234 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String a = sc.nextLine();
            int nLetter = 0;
            for (int i = 0; i < a.length(); i++) {
                char p = a.charAt(i);
                if (Character.isLetter(p)) {
                    if (nLetter % 2 == 0) {
                        System.out.print(Character.toUpperCase(p));
                    }else {
                        System.out.print(Character.toLowerCase(p));

                    }
                    nLetter++;

                }else{
                    System.out.print(p);
                }

            }
            System.out.println();


        }
    }
}