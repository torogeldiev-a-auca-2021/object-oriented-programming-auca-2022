import java.util.Scanner;

public class URI1255 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        scn.nextLine();
        for (int i = 0; i < a; i++) {
            String str = scn.nextLine();
            freq(str);
        }
    }

    public static void freq(String str) {
        char[] c = str.toCharArray();
        int[] array = new int[26];
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < str.length(); i ++) {
            for (int j = 0; j < 26; j ++) {
                if (Character.isLetter(c[i])) {
                    if (Character.isLowerCase(c[i])) {
                        if ((int) c[i] - (int) 'a' == j) {
                            array[j] ++;
                        }
                    } else {
                        if ((int) c[i] - (int) 'A' == j) {
                            array[j] ++;
                        }
                    }
                }
            }
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.print(chars[i]);
            }
        }
        System.out.println();
    }
}

