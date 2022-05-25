package p03;

import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args) {
        int[] a0 = {9, 1, 0, 6, 2, 5, 5, 0};
        MyArrays.sort(a0);
        System.out.println(Arrays.toString(a0));
        Rational[] a1 ={
                new Rational(3,1),
                new Rational(1,2),
                new Rational(2,1),
                new Rational(2,3)
        };
        MyArrays.sort(a1);
        System.out.println(Arrays.toString(a1));
        Student[] students = {
                new Student("Student D", 4.00, 2002),
                new Student("Student A", 3.00, 2003),
                new Student("Student C", 2.50, 2002),
                new Student("Student C", 3.12, 2000)
        };
        MyArrays.sort(students, new MyComparatorByName());
        System.out.println(Arrays.toString(students));
    }
}
class MyComparatorByName implements MyComparator{
    @Override
    public int compare(Object o1, Object o2){
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        return s1.getName().compareTo(s2.getName());
    }
}