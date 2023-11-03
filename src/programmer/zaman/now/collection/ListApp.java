package programmer.zaman.now.collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
    public static void main(String[] args) {

        List<String> string = new ArrayList<>(100);

        string.add("Hanif");
        string.add("Faiz");

        string.set(0,"Haikal");

        string.remove(1);
        System.out.println(string.get(0));


    }
}
