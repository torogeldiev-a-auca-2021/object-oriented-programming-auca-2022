package p03;

public class MyArrays {
    public static void sort(int[] a){ //for int
        //insertion sort
        for (int i = 0; i < a.length; i++) {
            int k = a[i]; //creating a copy
            int j = i-1; //from right to the left
            while(j>=0 && a[j]>k){
                a[j+1] = a[j];
                --j;
            }
            a[j+1] = k;
        }
    }
    public static void sort(Object[] a){ //for rational
        for (int i = 0; i < a.length; i++) {
            Object k = a[i]; //creating a copy
            int j = i-1; //from right to the left
            while(j>=0 && ((MyComparable)a[j].compareTo(k) > 0)){
                a[j+1] = a[j];
                --j;
            }
            a[j+1] = k;
        }
    }
}
    public static void sort(Object[] a, MyComparator cmp){ //for rational
        for (int i = 0; i < a.length; i++) {
            Object k = a[i]; //creating a copy
            int j = i-1; //from right to the left
            while(j>=0 && cmp.compareTo(a[j],k) > 0){
                a[j+1] = a[j];
                --j;
            }
            a[j+1] = k;
        }
    }
}
