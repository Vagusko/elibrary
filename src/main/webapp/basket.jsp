<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:useBean id="basketService"
             class="osu.cv.elibrary.services.BasketService"
             scope="session"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"/>
<c:if test="${!basketService.items.isEmpty()}">
    <h1>
        Můj košík
    </h1>
    <table class="table">
        <tr>
            <th>Nazev zboží</th>
            <th>Autor</th>
        </tr>
        <c:forEach var="item" items="${basketService.items}">
            <tr>
                <td>${item.key.name}</td>
                <td>${item.key.author}</td>
            </tr>
        </c:forEach>
    </table>
    <form action="pay" method="post">
        <button class="col btn btn-primary" type="submit">
            Zaplatit
        </button>
    </form>
</c:if>
<c:if test="${basketService.items.isEmpty()}">
    <h1>Váš košík je prázdny <a href="index.jsp"> Zpět </a></h1>
</c:if>
<jsp:include page="footer.jsp"/>