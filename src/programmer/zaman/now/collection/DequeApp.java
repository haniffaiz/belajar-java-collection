package programmer.zaman.now.collection;

import java.util.Deque;
import java.util.LinkedList;

public class DequeApp {
    public static void main(String[] args) {

        Deque<String> deque = new LinkedList<>();

        deque.offerLast("Hanif");
        deque.offerLast("Faiz");
        deque.offerLast("Hidayat");

        for(var value : deque){
            System.out.println(value);
        }

    }
}
