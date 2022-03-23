import java.util.ArrayList;

public class autoboxing {
    public static void main(String[] args) {
        {
            ///built - int type , fundamentional  type, primitive type
            int x = 42;
            //Class (type) integer
            Integer box = x; // new Integer(x) autoboxing since JAva 5

            ArrayList<Integer> list = new ArrayList<>();
            list.add(x);
            list.add(box);
            list.add(1111142);//autoboxing create wrapper

            System.out.println(list);
            if(list.get(0) != list.get(2)){//unboxing list.get(2);
                System.out.println("!!!");
            }
            if(list.get(0) != 1111142){//unboxing list.get(2);
                System.out.println("!!!");
            }
        }
    }
}
