    import java.util.Scanner;

    public class URI1768 {
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                int a = sc.nextInt();
                sc.nextLine();
                String b = "";
                String feet = "";
                int middle = a / 2;
                int end = middle;
                for (int i = 0; i < a ; i += 2) {
                    for (int j = 0; j < middle ; j++) {
                        System.out.print(" ");
                    }
                    middle--;
                    b += "*";
                    System.out.println(b);
                    b += "*";
                }
                for (int i = 0; i < 2 ; i ++) {
                    for (int j = 0; j < end ; j++) {
                        System.out.print(" ");
                    }
                    end--;
                    feet += "*";
                    System.out.println(feet);
                    feet += "*";
                }
                System.out.println();
            }
        }
    }
