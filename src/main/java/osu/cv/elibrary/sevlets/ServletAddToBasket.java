package osu.cv.elibrary.sevlets;

import osu.cv.elibrary.models.Book;
import osu.cv.elibrary.services.BasketService;
import osu.cv.elibrary.services.BookService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "ServletAddToBasket", value = "/add-to-basket")
public class ServletAddToBasket extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));

        BasketService basketService = (BasketService)
                request.getSession().getAttribute("basketService");

        BookService bookService = (BookService)
                request.getServletContext().getAttribute("bookService");

        Book book = bookService
                .getBooks()
                .stream()
                .filter(book1 -> book1.getId() == id)
                .findFirst()
                .get();

        basketService.addProduct(book);
        response.sendRedirect("index.jsp");
    }
}
