import java.util.AbstractList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        SmartArray<Integer> array = new SmartArray<>();

        for (int i = 0; i < 100; i++) {
            array.add(i);
        }

        array.filter(n -> n % 2 == 0);

        System.out.println(array.contains(5));
        System.out.println(array.contains(88));

        AbstractList<Integer> list = new LinkedList<>();

        Map map = new HashMap();

        list.remo


        list.add(5);
    }
}