package programmer.zaman.now.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new LinkedHashMap<>();

        map.put("first", "Hanif");
        map.put("last", "Hidayat");
        map.put("middle", "Faiz");

        Set<String> keys = map.keySet();
        for(var key : keys){
            System.out.println(key);
        }


    }
}
