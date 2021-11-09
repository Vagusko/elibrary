package osu.cv.elibrary.models;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Book, Integer> items = new HashMap<>();

    public void add (Book book) {
        if (items.containsKey(book)) {
            items.put(book, items.get(book) + 1);
        } else {
            items.put(book, 1);
        }
    }

    public Map<Book, Integer> getItems() {
        return new HashMap<>(this.items);
    }
}
