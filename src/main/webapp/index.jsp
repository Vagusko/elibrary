<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<br/>
<form action="add-book-servlet" method="post">
    <label>
        ID knihy:
        <input type="number" name="id">
    </label>
    <label>
        Nazev knihy:
        <input type="text" name="name">
    </label>
    <label>
        Autor:
        <input type="text" name="author">
    </label>
    <label>
        Odkaz:
        <input type="text" name="downloadLink">
    </label>
    <input type="submit" name="submit" value="submit">
</form>
<jsp:include page="bookList.jsp"/>
<hr>
<jsp:include page="basket.jsp"/>
</body>
</html>