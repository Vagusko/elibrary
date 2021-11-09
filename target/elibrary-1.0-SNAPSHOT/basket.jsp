<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="basketService"
             class="osu.cv.elibrary.services.BasketService"
             scope="session"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<h1>
    Můj košík
</h1>
<table>
    <tr>
        <td>Nazev zboží</td>
        <td>Autor</td>
    </tr>
    <c:forEach var="item" items="${basketService.items}">
        <tr>
            <td>${item.key.name}</td>
            <td>${item.key.author}</td>
        </tr>
    </c:forEach>
    <button>
        Zaplatit
    </button>
</table>