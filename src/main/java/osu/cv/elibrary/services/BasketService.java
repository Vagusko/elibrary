package osu.cv.elibrary.services;

import osu.cv.elibrary.models.Basket;
import osu.cv.elibrary.models.Book;

import java.util.Map;

public class BasketService {
    private Basket basket = new Basket();

    public void addProduct(Book book) {
        basket.add(book);
    }

    public Map<Book, Integer> getItems() {
        return basket.getItems();
    }
}
