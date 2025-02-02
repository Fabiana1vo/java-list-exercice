import java.util.ArrayList;
import java.util.List;

public class application {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Black");

        System.out.println(list);
        for(String x : list) {
            System.out.println(x);
        }
    }

}
