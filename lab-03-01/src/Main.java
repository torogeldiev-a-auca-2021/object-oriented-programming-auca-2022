import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Rational a = Rational.parse(scan.nextLine());
        Rational b = Rational.parse(scan.nextLine());

        Rational sum = a.add(b);
        Rational sub = a.subtract(b);
        Rational prod = a.multiply(b);
        Rational div = a.divide(b);

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(prod);
        System.out.println(div);

        System.out.printf("%s < %s: %b%n", a, b, a.compareTo(b));

        System.out.println(Rational.count);
    }
}