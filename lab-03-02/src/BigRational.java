import java.math.BigInteger;

public class BigRational {
    private BigInteger num;
    private BigInteger den;


    public BigRational(BigInteger num, BigInteger den) {
        if (den.equals(BigInteger.ZERO)) {
            throw new RuntimeException("Rational: denominator is equal to 0");
        }
        if (den.compareTo(BigInteger.ZERO) < 0) {
            num = num.negate();
            den = den.negate();
        }
        BigInteger d = num.gcd(den);

        this.num = num.divide(d);
        this.den = den.divide(d);

    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    public BigRational add(BigRational other) {
        BigInteger tempNum = num.multiply(other.den).add(other.num.multiply(den));
        BigInteger tempDen = den.multiply(other.den);

        return new BigRational(tempNum, tempDen);
    }

    public BigRational subtract(BigRational other) {
        BigInteger tempNum = num.multiply(other.den).subtract(other.num.multiply(den));
        BigInteger tempDen = den.multiply(other.den);

        return new BigRational(tempNum, tempDen);
    }

    public BigRational multiply(BigRational other) {
        BigInteger tempNum = num.multiply(other.num);
        BigInteger tempDen = den.multiply(other.den);

        return new BigRational(tempNum, tempDen);
    }

    public BigRational divide(BigRational other) {
        BigInteger tempNum = num.multiply(other.den);
        BigInteger tempDen = den.multiply(other.num);

        return new BigRational(tempNum, tempDen);
    }


    public int compareTo(BigRational other) {

        return num.multiply(other.den).compareTo(other.num.multiply(den));
    }

    public static BigRational parse(String s) {
        try {
            int index = s.indexOf('/');
            if (index == -1) {
                return new BigRational(new BigInteger(s), BigInteger.valueOf(1));
            }
            return new BigRational(new BigInteger(s.substring(0, index)),
                    new BigInteger(s.substring(index + 1))
            );
        } catch (NumberFormatException e) {
            throw new RuntimeException("Incorrect Rational" + s);
        }
    }
}