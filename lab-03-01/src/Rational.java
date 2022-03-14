public class Rational {
    private int num;
    private int den;
    static int count = 0;

    public Rational(int xNum, int xDen) {
        if (xDen == 0) {
            throw new RuntimeException("Rational: denominator is equal to 0");
        }
        int a = xNum;
        int b = xDen;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        num = xNum / a;
        den = xDen / a;
        if (den < 0) {
            num = -num;
            den = -den;
        }
        count++;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    public Rational add(Rational other) {
        int tempNum = num * other.den + other.num * den;
        int tempDen = den * other.den;

        return new Rational(tempNum, tempDen);
    }

    public Rational subtract(Rational other) {
        int tempNum = num * other.den - other.num * den;
        int tempDen = den * other.den;

        return new Rational(tempNum, tempDen);
    }

    public Rational multiply(Rational other) {
        int tempNum = num * other.den;
        int tempDen = den * other.den;

        return new Rational(tempNum, tempDen);
    }

    public Rational divide(Rational other) {
        int tempNum = num * other.den;
        int tempDen = den * other.num;

        return new Rational(tempNum, tempDen);
    }

    public int compareTo(Rational other) {
        return Integer.compare(num * other.den, den * other.num);
    }

    public static Rational parse(String s) {
        try {
            int index = s.indexOf('/');
            if (index == -1) {
                return new Rational((Integer.parseInt(s)), 1);
            }
            return new Rational(
                    Integer.parseInt(s.substring(0, index)),
                    Integer.parseInt(s.substring(index + 1))
            );
        } catch (NumberFormatException e) {
            throw new RuntimeException("Incorrect Rational" + s);
        }
    }
}