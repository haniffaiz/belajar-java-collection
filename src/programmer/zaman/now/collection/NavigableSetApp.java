package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
    public static void main(String[] args) {

        NavigableSet<String> names = new TreeSet<>();
        names.addAll(Set.of("Hanif", "Faiz", "Hidayat"));

        NavigableSet<String> nameReverse = names.descendingSet();
        NavigableSet<String> faiz = names.headSet("faiz",true);

        for (var name : faiz){
            System.out.println(name);
        }

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(names);
//        immutable.add("Ups");
    }
}
