package programmer.zaman.now.collection;


import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Hanif");
        map.put("name.middle", "Faiz");
        map.put("name.last", "Hidayat");


        System.out.println(map.get("name.first"));

    }
}
