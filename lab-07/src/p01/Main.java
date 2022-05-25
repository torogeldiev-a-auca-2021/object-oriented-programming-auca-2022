package p01;

import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        int[] a0 = {9, 1, 0, 6, 2, 5, 5, 0};
        Arrays.sort(a0);
        System.out.println(Arrays.toString(a0));
        String[] a1 = {"Java", "C++", "Asm", "C", "Python", "Kotlin", "Javascript"};
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        BigInteger[] a2 = {
                new BigInteger(("2342342")),
                new BigInteger("1"),
                new BigInteger("2222222222"),
                new BigInteger("2343")
        };
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a2));
        Rational[] a3 ={
                new Rational(3,1),
                new Rational(1,2),
                new Rational(2,1),
                new Rational(2,3)
        };
        Arrays.sort(a3);
        System.out.println(Arrays.toString(a3));
    }
}