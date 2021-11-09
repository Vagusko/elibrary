package osu.cv.elibrary.services;

import osu.cv.elibrary.models.Basket;
import osu.cv.elibrary.models.Book;

import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class BasketService {
    private Basket basket = new Basket();

    public void addProduct(Book book) {
        basket.add(book);
    }

    public Map<Book, Integer> getItems() {
        return basket.getItems();
    }

    public void clearBasket() {
        basket = new Basket();
    }

    public boolean getCheckIfItemExistsInBasket(Book book) {
        AtomicBoolean ret = new AtomicBoolean(false);
        basket.getItems().forEach(
                (key, value) -> {
                    int itemId = key.getId();
                    if (itemId == book.getId()) {
                        ret.set(true);
                    }
                }
        );
        return ret.get();
    }
}
