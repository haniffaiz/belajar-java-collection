package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Hanif");
        collection.add("Faiz");
        collection.add("Hidayat");
        collection.addAll(List.of("Programmer", "Zaman", "Now"));

        for(var value : collection){
            System.out.println(value);
        }

        System.out.println("REMOVE");

        collection.remove("Hidayat");
        collection.removeAll(List.of("Programmer", "Zaman", "Now"));

        for(var value : collection){
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Faiz")
        );

        System.out.println(
                collection.containsAll(List.of("Programmer", "Zaman", "Now"))
        );
    }
}
