<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="bookService" class="osu.cv.elibrary.services.BookService"
             scope="application"/>

<body>
<table>
    <tr>
        <td>
            Název knihy
        </td>
        <td>
            Autor
        </td>
    </tr>
    <c:forEach var="book" items="${bookService.books}">
        <tr>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>
                <form action="add-to-basket" method="post">
                    <input type="hidden" name="id" value="${book.id}">
                    <button type="submit">
                        Přidat do košíku
                    </button>
                </form>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
