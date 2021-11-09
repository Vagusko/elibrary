<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="bookService" class="osu.cv.elibrary.services.BookService"
             scope="application"/>

<jsp:useBean id="basketService"
             class="osu.cv.elibrary.services.BasketService"
             scope="session"/>
<body>
<h1>Nabídka knih</h1>
<table class="table">
    <tr>
        <th>
            Název knihy
        </th>
        <th>
            Autor
        </th>
    </tr>
    <c:forEach var="book" items="${bookService.books}">
        <tr>
            <td>${book.name}</td>
            <td>${book.author}</td>
            <td>
                <c:if test="${book.purchased == false}">
                    <c:if test="${!basketService.getCheckIfItemExistsInBasket(book)}">
                        <form action="add-to-basket" method="post">
                            <input type="hidden" name="id" value="${book.id}">
                            <button type="submit" class="btn btn-secondary">
                                Přidat do košíku
                            </button>
                        </form>
                    </c:if>
                    <c:if test="${basketService.getCheckIfItemExistsInBasket(book)}">
                        <small>Přidáno do košíku</small>
                    </c:if>
                </c:if>
                <c:if test="${book.purchased == true}">
                    Odkaz ke stažení: ${book.downloadLink}
                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
