import java.util.ArrayList;
import java.util.List;

public class set {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.addFirst("Brown");
        String el = list.set(1,"Pink");

        System.out.println(list);


    }
}
