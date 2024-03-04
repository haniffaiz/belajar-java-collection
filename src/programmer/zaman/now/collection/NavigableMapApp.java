package programmer.zaman.now.collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Hanif", "Hanif");
        map.put("Faiz", "Faiz");
        map.put("Hidayat", "Hidayat");

        for(var key : map.keySet()){
            System.out.println(key);
        }

        System.out.println("---");
        System.out.println(map.lowerKey("Hanif"));
        System.out.println(map.higherKey("Hanif"));
        System.out.println("---");

        NavigableMap<String, String> mapDesc = map.descendingMap();

        for(var key : mapDesc.keySet()){
            System.out.println(key);
        }

        NavigableMap<String,String> empty = Collections.emptyNavigableMap();
        NavigableMap<String,String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

//        immutable.put("Hanif", "Hanif");error
    }
}
