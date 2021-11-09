package osu.cv.elibrary.sevlets;

import osu.cv.elibrary.models.Book;
import osu.cv.elibrary.services.BookService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletAddBook", value = "/add-book-servlet")
public class ServletAddBook extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String message = "Add book servlet";
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BookService bookService = (BookService)
                request.getServletContext().getAttribute("bookService");

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String author = request.getParameter("author");
        String downloadLink = request.getParameter("downloadLink");

        Book newBook = new Book(id, name, author, downloadLink);
        bookService.addBook(newBook);

        response.sendRedirect("index.jsp");
    }
}
