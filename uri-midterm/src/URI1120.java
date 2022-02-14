import java.util.Scanner;

public class URI1120 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        do {
            char problemDigit = scn.next().charAt(0);
            String str = scn.next();
            if (str.equals("0") && problemDigit == '0')
                break;
            else
                point(problemDigit, str);

        } while (true);
    }

    static void point(char problemdigit, String str) {
        String result = "";
        str = str.replace(problemdigit + "", "");
        if(str.equals("")){
            System.out.println('0');
            return;
        }
        if (str.charAt(0) == '0') {
            int i = 0;
            while (str.charAt(i) == '0') {
                i++;
                if (i == str.length()) {
                    break;
                }
            }
            result = str.substring(i, str.length());
            if (result.equals("")) {
                result += '0';
            }
            System.out.println(result);
        } else {
            System.out.println(str);
        }
    }
}

