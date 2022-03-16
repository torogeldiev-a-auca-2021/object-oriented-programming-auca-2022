import java.util.Scanner;

public class URI2356 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            while (sc.hasNextLine()) {
                String dna = sc.next();
                String code = sc.next();

                if (dna.contains(code) && dna.length() > code.length()) {
                    System.out.println("Resistente");
                } else {
                    System.out.println("Nao resistente");
                }
            }
    }
}
