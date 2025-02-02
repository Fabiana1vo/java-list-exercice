import java.util.ArrayList;
import java.util.List;

public class updateByEl {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.addFirst("Brown");
        int index = list.indexOf("Orange");

        String el = list.set(index,"Blue");

        System.out.println(list);
    }
}
