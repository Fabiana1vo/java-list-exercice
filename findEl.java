import java.util.ArrayList;
import java.util.List;

public class findEl {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Green");
        list.add("Orange");

        if(list.contains("Red")){
            System.out.println("Red");
        } else {
            System.out.println("Elemento não encontrado");
        }


        System.out.println(list);

    }
}
