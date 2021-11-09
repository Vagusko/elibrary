package osu.cv.elibrary.sevlets;

import osu.cv.elibrary.models.Book;
import osu.cv.elibrary.services.BasketService;
import osu.cv.elibrary.services.BookService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ServletPay", value = "/pay")
public class ServletPay extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BasketService basketService = (BasketService)
                request.getSession().getAttribute("basketService");

        BookService bookService = (BookService)
                request.getServletContext().getAttribute("bookService");

        List<Book> books = bookService.getBooks();
        Map<Book, Integer> items = basketService.getItems();

        items.forEach((key, value) ->
                books.forEach((book ->
                {
                    int itemId = key.getId();
                    int bookId = book.getId();
                    if (itemId == bookId) {
                        bookService.payBook(book);
                    }
                }
                )));

        basketService.clearBasket();
        response.sendRedirect("index.jsp");
    }
}
