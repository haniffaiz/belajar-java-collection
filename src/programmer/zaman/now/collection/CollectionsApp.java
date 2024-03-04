package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(List.of("Hanif", "Faiz", "Hidayat"));

        System.out.println("--- LIST ---");
        System.out.println(list);

        System.out.println("--- REV ---");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("--- SHUF ---");
        Collections.shuffle(list);
        System.out.println(list);

    }

}
