package programmer.zaman.now.collection;

//import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {

//        Set<String> names = new HashSet<>(); tidak urut

        Set<String> names = new LinkedHashSet<>(); //berurutan

        names.add("Hanif");
        names.add("Faiz");
        names.add("Hidayat");

        names.add("Hanif");
        names.add("Faiz");
        names.add("Hidayat");

        for(var name : names){
            System.out.println(name);
        }
    }
}
