package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {

    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Hanif");

        Set<String> mutable = new HashSet<>();
        mutable.add("Hanif");
        mutable.add("Faiz");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

//        error
        Set<String> set = Set.of("Hanif", "Faiz", "Hidayat");

        set.remove("Hanif");
    }
}
