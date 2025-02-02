import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class cloneList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Orange");


        list2.add("1");
        list2.add("2");
        list2.add("3");

      Collections.copy(list2,list);

        System.out.println(list);
        System.out.println(list2);

    }
}
