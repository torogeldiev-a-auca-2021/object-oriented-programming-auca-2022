import java.util.Scanner;

public class URI1239 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        while (scn.hasNext()) {
            String msg = scn.nextLine();
            StringBuilder mseg = new StringBuilder(msg);
            int num1 = 0;
            int num2 = 0;
            for (int i = 0; i < mseg.length(); i++) {
                if (mseg.charAt(i) == '_') {
                    mseg.deleteCharAt(i);
                    if (num1 == 0) {
                        mseg.insert(i, "<i>");
                        num1++;

                    } else {
                        mseg.insert(i, "</i>");
                        num1 = 0;
                    }

                } else if (mseg.charAt(i) == '*') {
                    mseg.deleteCharAt(i);
                    if (num2 == 0) {
                        mseg.insert(i, "<b>");
                        num2++;
                    } else {
                        mseg.insert(i, "</b>");
                        num2 = 0;
                    }
                }
            }
            System.out.println(mseg);
        }
    }
}