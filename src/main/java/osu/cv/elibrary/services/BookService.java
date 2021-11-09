package osu.cv.elibrary.services;

import osu.cv.elibrary.models.Book;

import java.util.ArrayList;
import java.util.List;

public class BookService {
    public List<Book> getBooks() {
        return new ArrayList<Book>(books);
    }

    public void addBook(Book book) {
        books.add(book);
    }
    private List<Book> books = new ArrayList<>();

    public BookService() {
        books.add(new Book(1, "Duna", "Frank Herbert", "www.boooks.cz/download"));
        books.add(new Book(2, "lotr", "J.R.R. Tolkien", "www.boooks.cz/download"));
        books.add(new Book(3, "RUR", "Karel Čapek", "www.boooks.cz/download"));
        books.add(new Book(4, "Harry Potter", "J.K. Rowling", "www.boooks.cz/download"));
    }
}
