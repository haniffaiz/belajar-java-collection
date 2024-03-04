package programmer.zaman.now.collection;

import programmer.zaman.now.collection.data.Person;
import programmer.zaman.now.collection.data.PersonComparator;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
    public static void main(String[] args) {

        SortedSet<Person> people = new TreeSet<>(new PersonComparator());
        //tambahkan .reverse jika DESC

        people.add(new Person("Hanif"));
        people.add(new Person("Faiz"));
        people.add(new Person("Hidayat"));

        for (var person : people){
            System.out.println(person.getName());
        }

    }
}
