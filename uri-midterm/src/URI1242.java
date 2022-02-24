import java.util.*;

public class URI1242 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowels = sc.next();
        StringBuilder msg  = new StringBuilder();
        final String eng_vowels = "aeiuo";
        for(char i : vowels.toCharArray()){
            if(eng_vowels.indexOf(i) != -1){
                msg.append(i);

            }
        }
        StringBuilder copy = new StringBuilder(vowels.toString());
        copy.reverse();
        if(msg.toString().equals(copy.toString())){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
